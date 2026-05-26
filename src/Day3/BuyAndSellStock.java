package Day3;

public class BuyAndSellStock {
    public static void main(String[] args) {

        int[] arr=new int[]{7,1,5,3,6,4};

        int profit=maxProfit(arr);

        System.out.println(profit);

    }

    private static int maxProfit(int[] arr) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i = 0; i < arr.length; i++) {
            if(minPrice>arr[i]){
                minPrice=arr[i];
            }
            if(arr[i]-minPrice>maxProfit){
                maxProfit=arr[i]-minPrice;
            }
        }
        return maxProfit;

    }
}
