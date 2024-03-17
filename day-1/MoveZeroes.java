public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] ={0,0,1};
        int out[] = moveZero(nums);
        for(int i:out){
            System.out.print(i+" ");
        }

    }
    public static int[] moveZero(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j]!=0){
                j++;
            }
        }
        return nums;
    }
}
