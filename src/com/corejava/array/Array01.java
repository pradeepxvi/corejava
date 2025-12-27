package com.corejava.array;

import java.util.Arrays;

class Array01 {

     public static void main(String[] args) {

          // int[] arr1 = {1,2,3,4,5};
          int arr1[] = { 1, 2, 3, 4, 5 };
          System.out.println(arr1.length);

          // int[] arr2 = new int[] {1,2,3,4,5};
          int arr2[] = new int[] { 1, 2, 3, 4, 5 };
          System.out.println(arr2.length);

          // int[] arr3 = new int[5];
          int arr3[] = new int[5];
          arr3[0] = 1;
          arr3[1] = 2;
          arr3[2] = 3;
          arr3[3] = 4;
          arr3[4] = 5;

          System.out.println(arr3.length);

          System.out.println(Arrays.toString(arr3).length());

          String arrayString = Arrays.toString(arr3);

          for (int i = 0; i < arrayString.length(); i++) {
               System.out.println(arrayString.charAt(i));
          }
     }
}