import numpy as np
import random
import matplotlib.pyplot as plt

# Define Device Parameters for Simulation
num_devices = 10
tasks = [(random.randint(800, 1500), random.randint(200, 500)) for _ in range(num_devices)]
ZL = [random.uniform(0.8, 1.2) for _ in range(num_devices)]  # Local computation capacity (in GHz)
ZM = 5.0  # Edge server capacity (in GHz)
piv = [random.uniform(0.9, 1.1) for _ in range(num_devices)]  # Transmission power
eta = 1e-26  # Energy coefficient
v = 0.5  # Transmission time coefficient

# Define Latency and Energy Objective Functions
def f1(X, tasks, ZL, ZM, v):
    total_latency = 0
    for i in range(len(X)):
        ci, bi = tasks[i]
        xi = X[i]
        TL_i = ((1 - xi) * ci) / ZL[i]
        TM_i = v * bi + (xi * ci) / ZM
        total_latency += TL_i + TM_i
    return total_latency

def f2(X, tasks, ZL, ZM, piv, eta):
    total_energy = 0
    for i in range(len(X)):
        ci, bi = tasks[i]
        xi = X[i]
        EL_i = eta * (ZL[i] ** 2) * (1 - xi) * ci
        EM_i = piv[i] * bi + eta * (ZM ** 2) * (xi * ci)
        total_energy += EL_i + EM_i
    return total_energy

# Run Optimization Algorithms and Track Latency and Energy over Generations
def firefly_optimization(pop_size, num_generations, dimension, bounds, tasks, ZL, ZM, piv, eta, v, alpha=0.5, beta0=1, gamma=1):
    population = initialize_population(pop_size, dimension, bounds)
    latency_over_time = []
    energy_over_time = []

    for gen in range(num_generations):
        for i in range(pop_size):
            for j in range(pop_size):
                if i != j:
                    r = np.linalg.norm(population[i] - population[j])
                    beta = beta0 * np.exp(-gamma * r ** 2)
                    if f1(population[j], tasks, ZL, ZM, v) < f1(population[i], tasks, ZL, ZM, v):
                        population[i] += beta * (population[j] - population[i]) + alpha * (np.random.rand(dimension) - 0.5)
        
        best_solution = min(population, key=lambda x: f1(x, tasks, ZL, ZM, v) + f2(x, tasks, ZL, ZM, piv, eta))
        latency_over_time.append(f1(best_solution, tasks, ZL, ZM, v))
        energy_over_time.append(f2(best_solution, tasks, ZL, ZM, piv, eta))
    
    return latency_over_time, energy_over_time

def whale_optimization(pop_size, num_generations, dimension, bounds, tasks, ZL, ZM, piv, eta, v, A=2, C=2):
    population = initialize_population(pop_size, dimension, bounds)
    latency_over_time = []
    energy_over_time = []

    for gen in range(num_generations):
        for i in range(pop_size):
            r = random.random()
            if r < 0.5:
                D = abs(C * population[0] - population[i])
                population[i] = population[0] - A * D
            else:
                rand_whale = population[random.randint(0, pop_size - 1)]
                D = abs(C * rand_whale - population[i])
                population[i] = rand_whale - A * D
        
        best_solution = min(population, key=lambda x: f1(x, tasks, ZL, ZM, v) + f2(x, tasks, ZL, ZM, piv, eta))
        latency_over_time.append(f1(best_solution, tasks, ZL, ZM, v))
        energy_over_time.append(f2(best_solution, tasks, ZL, ZM, piv, eta))
    
    return latency_over_time, energy_over_time

# Simulation Parameters
pop_size = 30
num_generations = 50
dimension = num_devices
bounds = [0, 1]

# Run Firefly and Whale Optimization
firefly_latency, firefly_energy = firefly_optimization(pop_size, num_generations, dimension, bounds, tasks, ZL, ZM, piv, eta, v)
woa_latency, woa_energy = whale_optimization(pop_size, num_generations, dimension, bounds, tasks, ZL, ZM, piv, eta, v)

# Plotting Results
plt.figure(figsize=(14, 6))

# Latency Comparison
plt.subplot(1, 2, 1)
plt.plot(firefly_latency, label="Firefly Algorithm", color="blue")
plt.plot(woa_latency, label="Whale Optimization Algorithm", color="red")
plt.xlabel("Generation")
plt.ylabel("Total Latency")
plt.title("Total Latency Over Generations")
plt.legend()

# Energy Comparison
plt.subplot(1, 2, 2)
plt.plot(firefly_energy, label="Firefly Algorithm", color="blue")
plt.plot(woa_energy, label="Whale Optimization Algorithm", color="red")
plt.xlabel("Generation")
plt.ylabel("Total Energy Consumption")
plt.title("Total Energy Consumption Over Generations")
plt.legend()

plt.tight_layout()
plt.show()
