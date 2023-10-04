# Author: Vaikan Peddi 
# Date: 4th October 2023
# Description: This is the first algorithm from CLRS - Insertion Sort.  

def insertion_sort(A:list[int]) -> None:
    n = len(A)
    for i in range(1, n):
        key = A[i]
        j = i - 1
        while j >= 0 and key < A[j]:
            A[j + 1] = A[j]
            j -= 1
        A[j+1] = key

if __name__ == "__main__":
    list1 = []
    list2 = [-1, 9, 5, 2, -3]

    insertion_sort(list1)
    insertion_sort(list2)
    
    print(list1)
    print(list2)

#Loop Invariant: A predicate or condition or statement that is true for every iteration of a loop

#Loop Invariant for Insertion Sort:
#   For a loop through the array at any time, the elements till i are sorted.