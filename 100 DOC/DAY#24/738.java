class Solution {
    public int monotoneIncreasingDigits(int n) {
        int[] digits = new int[Integer.toString(n).length()];
        int index = digits.length - 1;
        while (n > 0) {
            digits[index--] = n % 10;
            n /= 10;
        }

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < digits[i - 1]) {
                digits[i - 1]--;
                for (int j = i; j < digits.length; j++) {
                    digits[j] = 9;
                }
            }
        }

        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }
}
