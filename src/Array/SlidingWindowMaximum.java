package Array;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int[] maxs = new int[nums.length-k+1];
        int pre=0;
        int last = k-1;
        while(last<nums.length){
            int index = pre;
            if(queue.peek()<pre){
                if(nums[last]>=nums[queue.peek()]){
                    queue.clear();
                    queue.offer(last);
                }else{
                    queue.poll();
                    if(queue.isEmpty()){
                        queue.offer(index);
                    }else{
                        while(index<=last){
                            if(nums[index]>=nums[queue.peek()]){
                                queue.clear();
                            }
                            queue.offer(index);
                            index++;
                        }
                    }
                }
            }else{
                while(index<=last){
                    if(nums[index]>=nums[queue.peek()]){
                        queue.clear();
                    }
                    queue.offer(index);
                    index++;
                }
            }

            maxs[pre]=nums[queue.peek()];
            pre++;
            last++;
        }
        return maxs;
    }
}
