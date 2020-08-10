package dp;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int[] dp = new int[nums.length];
        int max = -1;
        for(int i=0;i<nums.length;i++){
            int pmax = 1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) {
                    pmax = Math.max(pmax, dp[j] + 1);
                }
            }
            dp[i]=pmax;
            max = Math.max(pmax,max);
        }
        return max;
    }
}
