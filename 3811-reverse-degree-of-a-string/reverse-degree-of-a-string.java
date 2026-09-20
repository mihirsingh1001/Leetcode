class Solution {
    public int reverseDegree(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char c = 'a';
        int sum = 0;
        for (int i = 26; i >= 1; i--) {
            map.put(c++, i);
        }
        // System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                sum += map.get(s.charAt(i)) * (i + 1);
            }
        }
        return sum;
    }
}