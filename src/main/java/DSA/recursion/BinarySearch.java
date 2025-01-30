package DSA.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,9};
        int target=6;
        System.out.println(binarysearchRecusrion(arr,target,0,arr.length-1));
        System.out.println(binarysearch(arr,target));
    }

    private static int binarysearch(int[] arr, int target) {
        int left=0;int right=arr.length-1;
        while (left<=right){
            int middle=(left+right)/2;
        if(arr[middle]==target){
            return middle;

        }
        if(arr[middle]>target){
            right=middle-1;

        }
        else{
            left=middle+1;
        }
        }
        return -1;
    }


    private static int binarysearchRecusrion(int[] arr, int target, int left, int right) {

        if(left>right){
            return -1;
        }
            int middle=(left+right)/2;
            if(arr[middle]==target){
                return middle;

            }
            if(arr[middle]>target){
                right=middle-1;
               return binarysearchRecusrion(arr, target, left, right);
            }
            else{
                left=middle+1;
                return binarysearchRecusrion(arr, target, left, right);
            }

        }




}
