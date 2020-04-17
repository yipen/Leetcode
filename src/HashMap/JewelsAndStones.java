package HashMap;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        if(J==null||J.isEmpty()||S==null||S.length()==0) return 0;
        Map<Character, Integer> j = new HashMap<>();
        char[] jchars = J.toCharArray();
        for(char x:jchars){
            j.put(x,0);
        }
        int result = 0;
        char[] schars = S.toCharArray();
        for(char y:schars){
            if(j.containsKey(y)){
                result++;
            }
        }
        return result;
    }
}
