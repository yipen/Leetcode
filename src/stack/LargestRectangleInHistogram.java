package stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i <= heights.length; i++) {
            while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
                int curH = heights[stack.pop()];
                res = Math.max(res, curH * (stack.isEmpty() ? i : i - stack.peek()-1));
            }
            stack.push(i);
        }
        return res;
    }
}
