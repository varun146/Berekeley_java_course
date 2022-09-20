package com.uniLecture;

import java.util.Hashtable;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Random rand = new Random();
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt(100);
//        }
//
//        System.out.println("Before sorting: ");
//        printArray(array);
//
//        mergeSort(array);
//
//        System.out.println("After sorting: ");
//        printArray(array);


        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Ishan");
        System.out.println(ht);

    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

//    public static void  quickSort(int[] arr, int low, int high){
//        int pivot = arr[high];
//
//        int leftPointer = low;
//        int rightPoiner  = high;
//
//        while(leftPointer < )
//    }


    public static void mergeSort(int[] arr){

        int length = arr.length;
        int mid = length/2;

        if(length < 2) return;


        int[] lefthalf = new int[mid];
        int[] righthalf = new int[length - mid];

        for (int i = 0; i < lefthalf.length; i++) {
            lefthalf[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            righthalf[i - mid] = arr[i];
        }

        mergeSort(lefthalf);
        mergeSort(righthalf);
        mergeHalves(arr, lefthalf, righthalf);

    }


    public static void  mergeHalves(int[] arr, int[] lefthalf, int[] righthalf){
        int leftsize  = lefthalf.length;
        int righsize = righthalf.length;

        int i=0, j = 0, k =0;
        while(i < leftsize && j < righsize){
            if(lefthalf[i] <= righthalf[k]){
                arr[k] = lefthalf[i];
                i++;
            }else {
                arr[k] = righthalf[j];
                j++;
            }
            k++;
        }


    }
}
