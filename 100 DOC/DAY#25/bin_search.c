/**
 * This is a code to implement the binary search algorithm in the C programming language

 * Author: Vaikan Peddi
 * Date: 21st October 2023
*/

#include<stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int bin_search(int*, int, int);

int main(void) {
    int a[] = {1, 2, 7, 9, 13, 17, 56, 59}; //size = 8
    printf("%d", bin_search(a, 8, 17));
    return 0;
}

int bin_search(int* array, int size, int num) {
    int low = 0; 
    int high = size-1;
    
    while (low <= high) {
        int mid = (low + high) / 2;
        if (num == array[mid]) {
            return mid;
        }
        else if (array[mid] > num) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    return -1;
}