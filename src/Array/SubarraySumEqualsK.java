package Array;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int res = 0;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        if(nums[0]==k) res += 1;
        for(int i=1;i<sums.length;i++){
            sums[i]=sums[i-1]+nums[i];
            if(sums[i]==k) res+=1;
            for(int j=0;j<i;j++){
                if(sums[i]-sums[j]==k) res+=1;
            }
        }
        return res;
    }
}
