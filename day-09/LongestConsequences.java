import java.util.Arrays;

public class LongestConsequences {
        public int longestConsecutive(int[] nums) {
            Arrays.sort(nums);
            int cnt = 1;
            int max = cnt;
            if(nums.length==0){
                return 0;
            }

            for(int i=0;i<nums.length-1;i++){
                if(nums[i+1]-nums[i]==1){
                    cnt++;
                }
                else if(nums[i+1]-nums[i]>1){
                    cnt = 1;
                }
                max = Math.max(max,cnt);
            }
            return max;
        }

}
