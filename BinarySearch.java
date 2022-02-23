package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,22,56,78,90};
        int target = 90;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int s =0;
        int e=arr.length -1;

        while (s<=e){
            //find middle
            int m=(s+e)/2;
            if (target<arr[m]){
                e=m-1;
            }
            else if (target>arr[m]){
                s=m+1;
            }
            else {          //targ ==m
                return m;
            }
        }
        return -1;
    }
}
