package com.dziekan30;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};

        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }

//    private static int[] reverse(int[] array){
//        int arraryReversed[] = new int[array.length];
//        int j =0;
//        for(int i = array.length-1; i >= 0; i--){
//            arraryReversed[j] = array[i];
//            j++;
//        }return arraryReversed;
//    }

}