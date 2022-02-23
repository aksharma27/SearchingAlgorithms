package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
     int[] nums={23,45,19,1,2,99,-11,28};
     int ans= linearsearch(nums, 28);
        System.out.println("your target elemetn is "+ 28);
        System.out.println("target element is present at "+ans+"th index");
  }

  static int linearsearch(int[] arrays, int target ){
        if (arrays.length==0){
            return -1;
        }
        for (int i=0; i<arrays.length; i++){
            //check for element at all index if it is equal to target
            int element =arrays[i];
            if (element==target){
                return i;
            }
        }
        return -1;
  }
}
