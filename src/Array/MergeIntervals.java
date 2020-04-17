package Array;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals==null||intervals.length==0) return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        List<int[]> listRes = new ArrayList<>();
        int[] first = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] perRes = mergeTwo(first,intervals[i]);
            if(perRes!=null){
                 first = perRes;
            }else{
                listRes.add(first);
                first=intervals[i];
            }
        }


        return listRes.toArray(new int[listRes.size()][]);
    }

    public int[] mergeTwo(int[] a, int[] b){
        int[] res = new int[2];
        if(b[0]>a[1]){
            return null;
        }
        if(b[0]<=a[1]){
            if(b[1]>=a[1]){
                res[0]=a[0];
                res[1]=b[1];
            }else{
                res[0]=a[0];
                res[1]=a[1];
            }
        }
        return res;
    }
}
