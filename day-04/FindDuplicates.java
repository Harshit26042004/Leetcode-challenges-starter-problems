import java.util.*;

public class FindDuplicates {
        public List<Integer> findDuplicates(int[] nums) {
            HashMap<Integer,Integer> hm  = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            ArrayList<Integer> out = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e: hm.entrySet()){
                if(e.getValue()>1){
                    out.add(e.getKey());
                }
            }
            return out;
        }

}
