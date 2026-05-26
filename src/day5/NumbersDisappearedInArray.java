package day5;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedInArray {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res= findDisappearedNumbers(nums);
        System.out.println(res);

    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                res.add(i+1);
            }
        }

        return res;

    }

}
