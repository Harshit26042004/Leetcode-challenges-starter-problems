import java.util.ArrayList;

public class TwoSum {

        public int[] twoSum(int[] nums, int target) {
            int a = 0;
            int b = 0;
            int temp = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i : nums){
                arr.add(i);
            }
            for(int i=0;i<nums.length;i++){
                temp = target-arr.get(i);
                if(arr.contains(temp) && i!=arr.indexOf(temp)){
                    a = i;
                    b = arr.indexOf(temp);
                    break;
                }
            }

            int[] out = {a,b};
            return out;

        }
    }
