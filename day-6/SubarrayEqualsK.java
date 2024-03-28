import java.util.*;
public class SubarrayEqualsK {

        public int subarraySum(int[] nums, int k) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            int result = 0;
            int sum = 0;
            hm.put(0,1);
            for(int i=0;i<nums.length;i++){
                sum += nums[i];

                if(hm.containsKey(sum-k)){
                    result += hm.get(sum-k);
                }
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
            return result;

        }

}
