package array;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        if(size == 0 || size == 1) return;
        int pre = size -2;
        int post = size -1;
        while(pre>=0&&nums[post]<=nums[pre]){
            post --;
            pre --;
        }
        int chosed = nums[pre];
        post = size -1;
        while(nums[post]<chosed){
            post --;
        }
        nums[pre] = nums[post];
        nums[post] = chosed;

        post = size -1;
        while(pre<post){
            int tmp = nums[pre];
            nums[pre] = nums[post];
            nums[post] = tmp;
        }
    }
}
