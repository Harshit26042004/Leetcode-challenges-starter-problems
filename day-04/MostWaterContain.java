public class MostWaterContain {

        public int maxArea(int[] height) {
            int max = 0;
            int i = 0;
            int j = height.length-1;

            while(i<j){
                int d = j-i;
                int min = Math.min(height[i],height[j]);
                max = max<(min*d)?(min*d):max;
                if(height[i]<height[j]){
                    i++;
                }
                else if(height[i]>height[j]){
                    j--;
                }
                else{
                    i++;
                    j--;
                }

            }

            return max;

        }

}
