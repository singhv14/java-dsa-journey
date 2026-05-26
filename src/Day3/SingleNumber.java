package Day3;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums={2,3,5,12,2,5,3};
        int result=singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=temp^nums[i];
        }
        return temp;

    }

}
