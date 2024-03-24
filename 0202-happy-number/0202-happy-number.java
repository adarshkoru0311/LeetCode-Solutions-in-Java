class Solution {
    public boolean isHappy(int n) {
        int temp, r, sum = 0, count = 0;
        temp = n;

        if (temp == 1)
            return true;
        else if (temp == 2)
            return false;
        else if (temp > 2 && temp <= Math.pow(2, 31) - 1) {

            for (int i = 1; i > 0; i++) {

                while (temp > 0) {
                    r = temp % 10;
                    sum = (int) (sum + Math.pow(r, 2));
                    temp /= 10;
                }
                if (sum == 1)
                    break;
                else if (sum == 4) {
                    return false;

                } else
                    temp = sum;
                sum = 0;
            }
        } else
            return false;

        return true;
    }
}