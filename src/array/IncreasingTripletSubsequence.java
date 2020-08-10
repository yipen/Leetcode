package array;

public class IncreasingTripletSubsequence {
//    Return true if there exists i, j, k
//    such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;

        for(int i=1;i<nums.length-1;i++){
            if(findBigger(nums,i+1,nums.length-1,nums[i])&&findSmaller(nums,0,i-1,nums[i])){
                return true;
            }
        }
        return false;
    }

    public boolean findSmaller(int[] nums, int start, int end, int target){
        for(int i=start;i<=end;i++){
            if(nums[i]<target){
                return true;
            }
        }
        return false;
    }

    public boolean findBigger(int[] nums, int start, int end, int target){
        for(int i=start;i<=end;i++){
            if(nums[i]>target){
                return true;
            }
        }
        return false;
    }
}
