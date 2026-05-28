package Revision;

public class BuyAndSellStock {
    public static void main(String[] args) {

        int[] nums={7, 2, 5, 1, 6, 4};

        int result=maximumProfit(nums);
        System.out.println(result);

    }

    private static int maximumProfit(int[] nums) {
        int minPrice=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minPrice){
                minPrice=nums[i];
            }
            if(nums[i]-minPrice>maxPrice){
                maxPrice=nums[i]-minPrice;
            }

        }
        return maxPrice;
    }
}
