package array;

public class LongestIncreasingPath {
//    public static void main(String[] args){
//        int[][] metrix = {{9,9,4},{6,6,8},{2,1,1}};
//        System.out.println(longestIncreasingPath(metrix));
//    }

    private static int[][] steps = {{1,0},{-1,0},{0,1},{0,-1}};
    public static int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] flag = new int[row][col];
        int max =1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                max = Math.max(max, helper(matrix, i, j, flag));
            }
        }
        return max;
    }

    public static int helper(int[][] matrix, int i, int j, int[][] flag){
        if(flag[i][j]!=0){
            return flag[i][j];
        }
        int max = 1;

        for(int k=0;k<steps.length;k++){
            int x = i+steps[k][0];
            int y = j+steps[k][1];
            if(x<0||x>=matrix.length||y<0||y>=matrix[0].length||matrix[x][y]<=matrix[i][j]){
                continue;
            }
            max= Math.max(helper(matrix, x, y, flag)+1,max);
        }
        flag[i][j]=max;
        return max;
    }
}
