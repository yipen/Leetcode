package Array;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        if(A==null||len==0){
            return A;
        }
        int[] B = new int[len];
        int j = 0;
        while(j<len){
            if(A[j]<0){
                j++;
            }else{
                break;
            }
        }
        int low=j-1, high=j;
        int start = 0;
        while(low>=0&&high<len){
            if(A[low]*A[low]<=A[high]*A[high]){
                B[start]=A[low]*A[low];
                low--;
            }else{
                B[start]=A[high]*A[high];
                high++;
            }
            start++;
        }
        if(low<0){
            for(int i=high;i<len;i++){
                B[start]=A[i]*A[i];
            }
        }else{
            for(int i=low;i>=0;i--){
                B[start]=A[i]*A[i];
            }
        }
        return B;
    }

    public int[] sortedSquaresII(int[] A) {
        int len = A.length;
        if(A==null||len==0){
            return A;
        }
        int start = len-1;
        int[] B = new int[len];
        int low = 0;
        int high = len-1;
        while(low<=high){
            if(A[low]*A[low]>=A[high]*A[high]){
                B[start]=A[low]*A[low];
                low++;
            }else{
                B[start]=A[high]*A[high];
                high--;
            }
            start--;
        }
        return B;
    }
}
