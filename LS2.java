package com.company;

public class LS2 {
    public static void main(String[] args) {
        String name="Abhishek";
        char target='i';
        System.out.println(search(name, target));
    }

    static int search(String str, char target){
        if (str.length()==0){
            return -1;
        }
        for (int i=0; i<str.length(); i++){
            //check for element at all index if it is equal to target
            if (target==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
