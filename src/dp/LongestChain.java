package dp;

import java.util.Arrays;

public class LongestChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs);
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        int result = 0;

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(pairs[i][0]>pairs[j][1]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            result = Math.max(dp[i], result);
        }

        return result;
    }
}
