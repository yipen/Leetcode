package Dp;

import java.util.Arrays;


public class CoinChange {
public static void main(String[] args){
    int[] coins = {1};
    int amount = 0;
    int res  = coinChange(coins, amount);
    System.out.println(res);
}

    public static int coinChange(int[] coins, int amount) {
        int[] res = new int[amount+1];
        for(int i=0;i<coins.length;i++){
            res[coins[i]]=1;
        }
        Arrays.sort(coins);
        for(int j=1;j<=amount;j++){
            if(res[j]==0){
                for(int k = 0;k<coins.length;k++){
                    int index = j-coins[k];
                    if(index>0&&res[index]>0){
                        res[j]=res[index]+1;
                    }
                }
            }
            System.out.println(res[j]);
        }

        return res[amount]>0?res[amount]:-1;
    }
}
