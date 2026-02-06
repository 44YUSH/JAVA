class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int i=0;
        int maxL = Integer.MIN_VALUE;

        for(int j=0; j<n; j++){
            while((long)nums[j] > (long)nums[i] * k){
                i++;
            }
            maxL = Math.max(maxL, j-i+1);
        }

        return n - maxL;
    }
}