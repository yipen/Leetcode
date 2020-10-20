package backTracking;

import linkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LettersPermutation {
    static List<String> result = new ArrayList<>();

    public static List<String> permute(String s) {
        char[] letters = s.toCharArray();
        List<Character> subs = new ArrayList<>();
        permuteHelper(subs, letters);
        return result;
    }

    public static void permuteHelper(List<Character> subs, char[] letters) {
        if (subs.size() == letters.length) {
            List<Character> tmp = new ArrayList<>(subs);
            result.add(tmp.toString());
            return;
        }

        for (int i = 0; i < letters.length; i++) {
            if (subs.contains(letters[i])) continue;
            subs.add(letters[i]);
            permuteHelper(subs, letters);
            subs.remove(subs.size() - 1);
        }
    }

    public static void main(String[] args){
        String s = "abc";
        permute(s);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
