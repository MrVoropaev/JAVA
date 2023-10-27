# Написать точно такую же процедуру, но в декларативном стиле

from random import randint
from typing import List

def bubble_sort(arr: List[int]) -> List[int]:
    if len(arr) == 0:
        raise ValueError('На вход должен подаваться непустой целочисленный список')
    sorted_arr = arr.copy()
    while True:
        swapped = False
        for i in range(len(sorted_arr) - 1):
            if sorted_arr[i] > sorted_arr[i + 1]:
                sorted_arr[i], sorted_arr[i + 1] = sorted_arr[i + 1], sorted_arr[i]
                swapped = True
        if not swapped:
            break
    return sorted_arr

numbers = [randint(0, 100) for i in range(7)]
print(numbers)
print(bubble_sort(numbers))