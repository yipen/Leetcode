package queue;

import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> ascend = new PriorityQueue<>();
    private PriorityQueue<Integer> decend = new PriorityQueue<>((a,b)->b-a);

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        ascend.add(num);
        decend.add(ascend.poll());
        if(decend.size()>ascend.size()){
            ascend.add(decend.poll());
        }
    }

    public double findMedian() {
        return ascend.size()>decend.size()?ascend.peek():(ascend.peek()+decend.peek())/2.0;
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
    public static void main(String[] args){
        PriorityQueue<Integer> decend = new PriorityQueue<>();
        decend.add(2);
        decend.add(1);
        System.out.println(decend.peek());
        decend.add(3);
        System.out.println(decend.peek());
    }
}
