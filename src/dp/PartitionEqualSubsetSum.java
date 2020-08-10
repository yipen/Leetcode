package dp;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        if(nums==null ||nums.length==0) return true;
        int sum = 0;
        for(int num:nums) sum += num;
        sum=sum/2;

        boolean[] selected = new boolean[sum+1];
        selected[0]=true;
        for(int i=0;i< nums.length;i++){
            for(int j=sum;j>=nums[i];j--){
                selected[j]=selected[j]||selected[j-nums[i]];
            }
        }
        return selected[sum];
    }
}
