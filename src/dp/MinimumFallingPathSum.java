package dp;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]+=Math.min(Math.min(A[i-1][j],A[i-1][Math.max(0,j-1)]),A[i-1][Math.min(A[0].length-1,j+1)]);
            }
        }
        return Arrays.stream(A[A.length-1]).min().getAsInt();
    }
}
