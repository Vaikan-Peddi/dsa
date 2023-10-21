# This is a python implementation of the binary seach in an integer array

def bin_search(arr, key):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            low = mid + 1
        else:
            high = mid - 1
    return -1

print(bin_search([1, 3, 7, 9, 12, 16, 19, 24, 27], 27))