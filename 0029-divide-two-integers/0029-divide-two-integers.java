
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long quotient = 0;

        while (a >= b) {
            long temp = b;
            long count = 1;

            while (a >= temp && a - temp >= temp) {
                temp += temp;
                count += count;
            }

            a -= temp;
            quotient += count;
        }

        return sign == -1 ? (int) -quotient : (int) quotient;
    }
}
