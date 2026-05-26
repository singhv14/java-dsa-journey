package Day4;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums= {0,1,0,2,3};

        int[] result=moveZeroToEnd(nums);

        System.out.println(Arrays.toString(result));

        moveZeroes(nums);

    }

    private static int[] moveZeroToEnd(int[] nums) {
//        if (nums.length==1) return nums;
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return nums;
    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
