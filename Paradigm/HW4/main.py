import numpy as np

import math

def mean(arr):
    return sum(arr) / len(arr)

def covariance(arr1, arr2):
    mean1 = mean(arr1)
    mean2 = mean(arr2)
    cov = sum((x - mean1) * (y - mean2) for x, y in zip(arr1, arr2)) / len(arr1)
    return cov

def standard_deviation(arr):
    mean_value = mean(arr)
    variance = sum((x - mean_value) ** 2 for x in arr) / len(arr)
    std_dev = math.sqrt(variance)
    return std_dev

def pearson_correlation(arr1, arr2):
    if len(arr1) != len(arr2):
        raise ValueError("Массивы должны иметь одинаковую длину.")
    if len(arr1) < 2:
        raise ValueError("Массивы должны иметь хотя бы два элемента.")
    
    cov = covariance(arr1, arr2)
    std_dev1 = standard_deviation(arr1)
    std_dev2 = standard_deviation(arr2)
    
    if std_dev1 == 0 or std_dev2 == 0:
        raise ValueError("Массивы должны иметь стандартное отклонение, отличное от нуля.")
    
    correlation = cov / (std_dev1 * std_dev2)
    return correlation

# Пример использования
array1 = [1, 2, 3, 4, 5]
array2 = [5, 4, 3, 2, 1]

try:
    correlation = pearson_correlation(array1, array2)
    print(correlation)
except ValueError as e:
    print("Ошибка:", e)

# def pearson_correlation(x, y):
#     if len(x) != len(y):
#         return "Ошибка: Длины массивов не совпадают"
#     if len(x) < 2 or len(y) < 2:
#         return "Ошибка: Массивы должны содержать хотя бы 2 элемента"

#     correlation = np.corrcoef(x, y)[0, 1]
#     return correlation

# # Пример использования
# x = [1, 2, 3, 4, 5]
# y = [2, 4, 6, 8, 10]

# result = pearson_correlation(x, y)
# print("Корреляция Пирсона:", result)

