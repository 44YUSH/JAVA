class Solution {
    public int minimumCost(int[] nums) {
        int fst = nums[0];
        Arrays.sort(nums, 1, nums.length);
        return fst + nums[1] + nums[2];
    }
}