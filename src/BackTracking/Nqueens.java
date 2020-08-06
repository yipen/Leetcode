package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] rowMap = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowMap[i][j] ='_';
            }
        }
        dfs(result, rowMap, 0, n);

        return result;
    }

    public void dfs(List<List<String>> res, char[][] oRes, int col, int n) {
        if(col > n){
            res.add(convert(oRes));
            return;
        }

        for(int i=0;i<n;i++){
            if(canLocate(oRes, i, col)){
                oRes[i][col]='Q';
                dfs(res, oRes, i, col+1);
                oRes[i][col]='_';
            }
        }

    }

    public boolean canLocate(char[][] oRes, int row, int col) {
        for(int i=0;i<oRes[0].length;i++){
            for(int j=0;j<col;j++){
                if(oRes[i][j]=='Q'){
                    if(i==row||(Math.abs(row-i)==col-j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public List<String> convert(char[][] oRes) {
        List<String> oneLine = new ArrayList<>();
        for (int i = 0; i < oRes[0].length; i++) {
            String res = "";
            for (char a : oRes[i]) {
                res += a;
            }
            oneLine.add(res);
        }
        return oneLine;
    }
}
