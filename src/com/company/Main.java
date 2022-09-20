package com.company;
import java.util.Random;
public class Main {

//    public static void mergesort(int[] arr){
//        mergesort(arr, new int[arr.length], 0, arr.length-1);
//    }
//
//    public static void mergesort(int[] arr, int[] temp, int leftStart, int rigthEnd){
//        if(leftStart >= rigthEnd) return;
//        int middle = leftStart + (rigthEnd -leftStart)/2;
//        mergesort(arr, temp, leftStart, middle);
//        mergesort(arr, temp, middle+12, rigthEnd);
//        mergeHalves(arr, temp, leftStart, rigthEnd);
//    }
//
//    private static void mergeHalves(int[] arr, int[] temp, int leftStart, int rigthEnd) {
//
//    }

    private static void mergeSort(int[] arr){
        int inputLength = arr.length;

        if(inputLength < 2) return;;

        int midIndex = inputLength/2;
        // Creating two subarrays
        int[] lefthalf = new int[midIndex];
        int[] righhalf = new int[inputLength-midIndex];

        for (int i=0; i < lefthalf.length; i++){
            lefthalf[i] = arr[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            righhalf[i - midIndex] = arr[i];
        }
        mergeSort(lefthalf);
        mergeSort(righhalf);
        // merge both halves;
        merge(arr, lefthalf, righhalf);

    }

    private static void  merge(int[] inputArray, int[] lefthalf, int[] righthalf ){
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;

        int i=0, j=0, k=0;
        while(i <leftsize && j<rightsize){
            if(lefthalf[i] <= righthalf[j]){
                inputArray[k] = lefthalf[i];
                i++;
            }else{
                inputArray[k] = righthalf[j];
                j++;
            }
            k++;
        }

        while (i < leftsize){
            inputArray[k] = lefthalf[i];
            i++;
            k++;
        }

        while(j < rightsize){
            inputArray[k] = righthalf[j];
            j++;
            k++;
        }
    }




    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];



        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("Before Sorting");
        printarray(array);

//        mergeSort(array);
//        bubbleSort(array);
//        quickSort(array);

        System.out.println("After Sorting");
        printarray(array);
    }




    public static void printarray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }




    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int pivotIndex = new Random().nextInt(high - low) + low;
        int pivot = arr[pivotIndex];
        int leftPointer = low;
        int rightPointer = high;

        swap(arr, pivotIndex, high);

        while(leftPointer < rightPointer){

            while(arr[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, high);

        quickSort(arr, low, leftPointer-1 );
        quickSort(arr, leftPointer+1, high);

    }






    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}
