class Solution {
    public int majorityElement(int[] nums) {
        int seat = 0;
        int vote = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (vote == 0) {
                seat = nums[i];
            }
            if (seat == nums[i]) {
                vote++;
            } else {
                vote--;
            }
        }
        return seat;
    }
}