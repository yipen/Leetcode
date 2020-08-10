package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        for (int i = 0; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(candidates[i]);
            helper(candidates, target - candidates[i], list, 0);
        }
        return result;
    }

    public void helper(int[] candidates, int target, List<Integer> list, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
        }else{
            for (int i = start; i < candidates.length; i++) {

                list.add(candidates[i]);
                helper(candidates, target - candidates[i], list, i);

            }
        }
        list.remove(list.size() - 1);
    }
}
