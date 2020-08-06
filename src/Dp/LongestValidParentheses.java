package Dp;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s.isEmpty()) return 0;
        char[] chars = s.toCharArray();
        int[] nums = new int[chars.length];
        int max = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==')'){
                if(i-1>=0){
                    if(chars[i-1]==')'){
                        if(nums[i-1]>0&&i-nums[i-1]>=1&&chars[i-nums[i-1]-1]=='('){
                            if(i-nums[i-1]-2>=0){
                                nums[i]=2+nums[i-1]+nums[i-nums[i-1]-2];
                            } else {
                                nums[i]=2+nums[i-1];
                            }

                        }
                    }else{
                        if(i-2>=0){
                            nums[i]=2+nums[i-2];
                        }else{
                            nums[i]=2;
                        }
                    }
                }
                max = Math.max(nums[i], max);
            }
        }
        return max;
    }
}
