package Day2;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int res=optimalApproach(arr);

        System.out.println(res);

    }

    private static int optimalApproach(int[] arr) {

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
