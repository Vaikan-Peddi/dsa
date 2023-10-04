# Author: Vaikan Peddi
# Date: 4th October 2023
# Description: We will be looking into a simple Divide-and-Conquer Algorithm: Merge Sort

def merge(A:list[int], p:int, q:int, r:int) -> None:
    left = A[p : q+1]
    right = A[q+1: r+1]
    
    i = 0
    j = 0
    k = p

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            A[k] = left[i]
            i += 1
        else:
            A[k] = right[j]
            j += 1
        k += 1

    if i < len(left): 
        A[k: r+1] = left[i:]
    if j < len(right): 
        A[k: r+1] = right[j:]

def merge_sort(A:list[int], p:int=0, r:int=None) -> None:
    if r == None:
        r = len(A)
    if p >= r:
        return
    q = (p + r) // 2
    merge_sort(A, p, q)
    merge_sort(A, q+1, r)
    merge(A, p, q, r)

test = [1, 6, 2, -1, -5]
merge_sort(test)
print(test)