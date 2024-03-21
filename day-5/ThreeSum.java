
import java.util.*;

public class ThreeSum {

        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> out = new ArrayList<>();

            for(int i=0;i<nums.length-2;i++){
                int j = i+1;
                int k = nums.length-1;
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }

                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];

                    if(sum==0){
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);

                        out.add(t);
                        while(j<k && nums[j]==nums[j+1]){
                            j++;
                        }
                        while(j<k && nums[k]==nums[k-1]){
                            k--;
                        }
                        j++;
                        k--;
                    }
                    else if(sum<0){
                        j++;
                    }
                    else{
                        k--;
                    }

                }
            }
            return out;

        }

}
