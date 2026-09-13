class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (str.length() < 1) {
            return true;
        }
        int start = 0;
        return rec(start, str);
    }

    private static boolean rec(int start, String str) {
        if (start >= str.length() / 2)
            return true;
        if (str.charAt(start) != str.charAt(str.length() - start - 1))
            return false;
        return rec(start + 1, str);
    }
}