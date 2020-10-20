package sort;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        int[] test1 = {1,4,2,5,7,2,8,3,6};
        int[] test2 = {8,2,5,1,6,7,3,4};
        quickSortHelper(test1, 0, test1.length-1);
        for(int i:test1) System.out.print(i+",");
        System.out.println();
        quickSortHelper(test2, 0, test2.length-1);
        for(int i:test2) System.out.print(i+",");
        Random ran = new Random();
        int x = ran.nextInt();
    }

    public static void quickSortHelper(int[] nums, int start, int end){
        if(start>=end) return;
        int left = start;
        int index = nums[left];
        int right = end;
        while(left<right){
            while(left<right&&nums[right]>index) right--;
            while(left<right&&nums[left]<=index) left++;
            int tmp = nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
        }
        nums[start]=nums[left];
        nums[left] = index;
        quickSortHelper(nums, start, left-1);
        quickSortHelper(nums, left+1, end);
    }
}
