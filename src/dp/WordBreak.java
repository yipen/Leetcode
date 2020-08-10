package dp;

import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length()+1];
        res[0]=true;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                String ss = s.substring(j,i+1);
                if(wordDict.contains(ss)&&(j==0||res[j-1])){
                    res[i]=true;
                    break;
                }
            }
        }
        return res[res.length-1];
    }

    public static void main(String[] args){
        String s = "abcdefg";
        System.out.println(s.substring(0,1));
    }

}
