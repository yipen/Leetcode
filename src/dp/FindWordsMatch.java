package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindWordsMatch {
    public static void main(String[] args){
        String a = "aaaaaaa";
        HashSet<String> dics = new HashSet<>();
        dics.add("a");
        dics.add("aa");
        dics.add("aaa");
        System.out.println("shabi");
        System.out.println(isMath(dics, a));
    }
    public static boolean isMath(HashSet<String> dics, String word){
        char[] array = word.toCharArray();
        Pair[] res = new Pair[array.length+1];
        Pair nouse = new Pair();
        nouse.first=true;
        res[0]=nouse;
        nouse.count.add(0);

        for(int i=1;i<res.length;i++){
            Pair tmp = new Pair();

            for(int j=0;j<i;j++){
                if(dics.contains(word.substring(j,i))&&res[j].first==true){
                    tmp.first=true;
                    List<Integer> tmpCount = res[j].count;
                    for(Integer c:tmpCount){
                        tmp.count.add(c+1);
                    }
                }
            }
            res[i]=tmp;
        }
        boolean x = res[res.length-1].first&&res[res.length-1].count.contains(2);
        return x;

    }
}
class Pair{
    boolean first;
    List<Integer> count = new ArrayList<>();
}
