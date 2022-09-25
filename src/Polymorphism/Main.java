package Polymorphism;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Before sorting");
        printArray(array);

        mergeSort(array);

        System.out.println("After sorting");
        printArray(array);


    }
 /* prints the array*/
    public static void  printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



    public static void mergeSort(int[] arr){
        int arr_Len = arr.length;
        if(arr_Len < 2){
            return;
        }

        int mid = arr_Len/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr_Len-mid];

        for (int i = 0; i <leftArray.length; i++) {
            leftArray[i] = arr[i];
        }
        for (int i = mid; i < rightArray.length; i++) {
            rightArray[i-mid] = arr[i];
        }


        Main.mergeSort(leftArray);
        Main.mergeSort(rightArray);

        mergeHalves(arr, leftArray, rightArray);
    }

    public static void mergeHalves(int[] arr, int[] left, int[] right) {

        int i =0;
        int j = 0;
        int k =0;
        while(i < left.length || j < right.length) {

            if(i < left.length && j < right.length)
            {
                if(left[i] <= right[j]){
                    arr[k++] = left[i++];
                }else {
                    arr[k++] = right[j++];
                }
            }

            else if(i < left.length){
                arr[k++] = left[i++];
            }

            else if(j< right.length){
                arr[k++] = right[j++];
            }
        }
    }
}
