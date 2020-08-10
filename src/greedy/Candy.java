package greedy;

public class Candy {
    public int candy(int[] ratings) {
        if(ratings==null||ratings.length<=0) return 0;
        int[] candies = new int[ratings.length];
        candies[0]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }else{
                candies[i]=Integer.min(1, candies[i]-1);
                if(candies[i]<=0){
                    candies[i]=1;
                    int j=i;
                    while(j>=0&&ratings[j]<ratings[j-1]&&candies[j]>=candies[j-1]){
                        candies[j-1]=candies[j]+1;
                        j--;
                    }
                }
            }
        }
        int result = 0;
        for(int i=0;i<candies.length;i++){
            result+=candies[i];
        }
        return result;
    }
}
