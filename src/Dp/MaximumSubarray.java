package Dp;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int[] sums = new int[nums.length];
        sums[0]=nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i]=Math.max(sums[i-1]+nums[i],nums[i]);
            max=Math.max(sums[i],max);
        }
        return max;
    }
}
