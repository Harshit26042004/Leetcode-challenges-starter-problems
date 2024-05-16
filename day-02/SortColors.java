class SortColors {
    public void sortColors(int[] nums) {
        int[] c = new int[3];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c[0]++;
            }
            if(nums[i]==1){
                c[1]++;
            }
            if(nums[i]==2){
                c[2]++;
            }
        }
        int count = 0;
        int color = 0;
        for(int j:c){
            for(int i=0;i<j;i++){
                nums[count] = color;
                count++;
            }
            color++;
        }


    }
}