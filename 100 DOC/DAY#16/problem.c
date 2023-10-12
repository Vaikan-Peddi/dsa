/**********************************************************
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 **********************************************************
 *
 * int get(MountainArray *, int index);
 * int length(MountainArray *);
 */

int peak(MountainArray* arr, int n) {
    int start = 0, end = n - 1;
    int res = -1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (get(arr, mid + 1) > get(arr, mid)) {
            start = mid + 1;
            res = mid + 1;
        } else {
            end = mid;
        }
    }
    return res;
}

int bs(int s, int e, MountainArray* arr, int target, int flag) {
    int res = -1;
    while (s <= e) {
        int mid = s + (e - s) / 2;
        if (target == get(arr, mid)) {
            res = mid;
            if (flag)
                s = mid + 1;
            else
                e = mid - 1;
        } else if (target > get(arr, mid)) {
            if (flag)
                e = mid - 1;
            else
                s = mid + 1;
        } else {
            if (flag)
                s = mid + 1;
            else
                e = mid - 1;
        }
    }
    return res;
}

int findInMountainArray(int target, MountainArray* mountainArr) {
    int n = length(mountainArr);
    if (n < 3)
        return -1;

    // 1. Find Peak Element.
    int part = peak(mountainArr, n);

    // 2. Left side search.
    int l = bs(0, part, mountainArr, target, 0);

    // If the element is present on the left side array.
    if (l != -1)
        return l;

    // If the element is not present on the left, then do the right search.
    int r = bs(part, n - 1, mountainArr, target, 1);
    return r;
}