package com.Testing;

import java.util.Arrays;
public class TestSort {
    public static void testSort(){
        String[] input  = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);

        if(Arrays.equals(input, expected)){
            System.out.println("There seems to a problem with Sort.sort");
        }
    }
    public static void main(String[] args) {
        testSort();
    }

    public static void testFindSmallest(){
        String[] input  = {"i", "have", "an", "egg"};
        String expected = "an";

        String actual = Sort.findSmallest(input);
//        org.junit.Assert.assertEquals(expected, actual);


    }
}
