class Solution {
    public int reverse(int x) {
        int val = Math.abs(x);
        int rev = 0;

        while (val > 0) {
            int rem = val % 10;

            // Overflow check
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0; 
            }

            rev = (rev * 10) + rem;
            val = val / 10;
        }

        return (x < 0) ? (-rev) : rev;
    }
}