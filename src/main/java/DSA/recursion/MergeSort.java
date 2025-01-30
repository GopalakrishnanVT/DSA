package DSA.recursion;

public class MergeSort {

    private static void sort(int[] arr){

        if(arr.length<2){
            return;
        }
        int middleNumber=arr.length/2;
        int[] leftArray=new int[middleNumber];
        int[] rightArray=new int[arr.length-middleNumber];
        for (int i=0;i<leftArray.length;i++){
            leftArray[i]=arr[i];
        }
        for (int j=middleNumber;j<arr.length;j++){
            rightArray[j-middleNumber]=arr[j];
        }
        sort(leftArray);
        sort(rightArray);

        mergeSort(leftArray,rightArray,arr);

    }
    private static void mergeSort(int[] leftArray, int[] rightArray, int[] arr) {
        int i=0;
        int j=0;
        int k=0;
        while(i<leftArray.length&&j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
                k++;
            }

        }
        while(i<leftArray.length){
            arr[k]=leftArray[i];
            i++;
            k++;
        }

        while(j<rightArray.length){
            arr[k]=rightArray[j];
            j++;
            k++;
        }

    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,9,7};
        sort(arr);
        printArray(arr);
    }
}
