class Solution {
    public boolean isPalindrome(int x) {
        int temp, r, sum = 0;
        temp = x;
        for (; temp > 0;) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp /= 10;
        }
        if (sum == x)
            return true;
        else
            return false;
    }
}