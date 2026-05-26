package Revision;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr={3, 5, 2, 8, 1};

        int target=11;

        int[]res=findTwoSum(arr,target);

        System.out.println(Arrays.toString(res));

    }

    private static int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

}
