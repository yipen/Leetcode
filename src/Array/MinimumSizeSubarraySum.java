package Array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null | nums.length == 0) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j++];
            while (sum >= s) {
                result = Integer.min(result, j - i);
                sum -= nums[i++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
