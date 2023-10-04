# Author: Vaikan Peddi
# Date: 4th October 2023
# Description: This is an O(n) algorithm for the problem of Maximum Sub-Array Sum.
#              We will be solving 2 versions of this problem:
#                       1. One without the indices describing the range
#                       2. One with description of the ranges of the start and stop of max sum


def without_indices(A:list[int]) -> int:

    max = -9999
    mtn = 0 # max til now

    for num in A:
        mtn = mtn + num
        if mtn > max:
            max = mtn
        if mtn < 0:
            mtn = 0
    return max

def with_indices(A:list[int]) -> list[int]:

    max = -9999
    mtn = 0

    i=-1
    j=-1

    answer = [-9999, -9999, -9999]

    for x in range(len(A)):
        mtn = mtn + A[x]
        if mtn - A[x] == 0:
            i = x
            j = x
            
        if mtn > max:
            max = mtn
            j=x

        if mtn < 0:
            mtn = 0
            i = -1
            j = -1
        
    return [max, i, j]

#Testing

if __name__ == "__main__":
    print(without_indices([-2, -3, 4, -1, -2 , 1, 5, -3]))
    print(with_indices([-2, -3, 4, -1, -2 , 1, 5, -3]))