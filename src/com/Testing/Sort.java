package com.Testing;

public class Sort {

    public static void sort(String[] input) {
        //find the smallest item
        // Move it to the front
        // Selection sort the rest of the items
    }


    public static String findSmallest(String[] input){

        int smallestIndex =0;
        for (int i = 0; i < input.length; i++) {
            int compare = input[i].compareTo(input[smallestIndex]);
            if(compare == -1){
                smallestIndex = i;
            }
        }

        return input[smallestIndex];
    }
}
