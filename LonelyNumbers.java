import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyNumbers {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> inp = new HashMap<>();
        List<Integer> out = new ArrayList<>();

        for(int a: nums){
            if(inp.containsKey(a)){
                inp.put(a, inp.get(a)+1);
            }else{
                inp.put(a,1);
            }
        }

        for(int a : inp.keySet()){
            if(inp.get(a)==1 && !inp.containsKey(a+1) && !inp.containsKey(a-1)){
                out.add(a);
            }
        }

        return out;
    }
}
