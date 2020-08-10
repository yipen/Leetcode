package array;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        if(A==null||A.length==0) return A;
        int low = 0;
        int high = A.length-1;
        while(low<high){
            while(low<high&&A[low]%2==0){
                low++;
            }
            while(low<high&&A[high]%2!=0){
                high--;
            }
            int tmp = A[low];
            A[low]=A[high];
            A[high]=tmp;
        }
        return A;
    }
}
