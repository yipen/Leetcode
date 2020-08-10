package array;

import java.util.HashMap;
import java.util.Map;

public class MaxPointsLine {
    public static void main(String[] args){
        int[][] test = {{1,1},{2,2},{3,3}};
        System.out.println(maxPoints(test));
    }

    public static int maxPoints(int[][] points) {
        Map<Double,Integer> maps = new HashMap<>();
        for(int i=0;i<points.length;i++){
            if(points[i][1]==0){
                if(maps.containsKey(0.0)){
                    maps.put(0.0, maps.get(0.0)+1);
                }else{
                    maps.put(0.0,1);
                }
            }else{
                double line = points[i][0]/points[i][1];
                if(maps.containsKey(line)){
                    maps.put(line, maps.get(line)+1);
                }else{
                    maps.put(line,1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry kv:maps.entrySet()){
            max=Math.max((int)kv.getValue(),max);
        }
        return max;
    }

}
