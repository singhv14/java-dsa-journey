package Day1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int [] arr = {2,7,12,11,7};
        int target = 9;

        int[] res=bruteForceApproach(arr,target);
        int[] res1=hashMapApproach(arr,target);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res1));

    }

    private static int[] hashMapApproach(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{0,0};
    }

    private static int[] bruteForceApproach(int[] arr, int target) {
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }

}
