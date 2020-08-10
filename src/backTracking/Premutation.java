package backTracking;

import java.util.ArrayList;
import java.util.List;

public class Premutation {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        helpPremute(nums, new ArrayList<>());
        return result;
    }

    public void helpPremute(int[] nums, List<Integer> list) {
        if (list.size() == nums.length) {
            List<Integer> perResult = new ArrayList<>(list);
            result.add(perResult);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            helpPremute(nums, list);
            list.remove(list.size()-1);
        }
    }
}
