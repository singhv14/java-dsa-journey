package Revision;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr={1, 1, 1, 2, 3, 3, 4};

        int result=removeDuplicatesInArray(arr);

    }

    private static int removeDuplicatesInArray(int[] arr) {
        
        if (arr.length==0) return 0;
        if (arr.length==1) return 1;
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

}
