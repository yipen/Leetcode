package backTracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result =  new ArrayList<>();
        result.add(0);
        for(int i=0;i<n;i++){
            int size = result.size();
            List<Integer> tmp = new ArrayList<>();
            for(int j=0;j<size;j++){
                tmp.add(result.get(j)*2);
            }
            for(int j=size-1;j>=0;j--){
                tmp.add(tmp.get(j)+1);
            }
            result = tmp;
        }
        return result;
    }
}
