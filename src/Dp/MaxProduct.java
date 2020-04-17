package Dp;

public class MaxProduct {
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        int y = maxProduct(nums);
    }

    public static int maxProduct(int[] nums) {
        int preMin = 1;
        int preMax = 1;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            int tpreMin = Math.min(num, Math.min(num*preMax,num*preMin));
            int tpreMax = Math.max(num, Math.max(num*preMax,num*preMin));
            preMin = tpreMin;
            preMax=tpreMax;
            max = Math.max(preMax, max);
        }
        return max;
    }
}
