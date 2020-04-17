package Array;

public class FindFirstandLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int start = findNumIndex(nums,target);
        if(start==nums.length||nums[start]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{start, findNumIndex(nums,target+1)-1};

    }

    public int findNumIndex(int[] nums, int target){
        int l =0, h=nums.length;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid;
            }
        }
        return l;
    }
}
