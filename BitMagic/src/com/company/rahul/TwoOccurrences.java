package com.company.rahul;

public class TwoOccurrences {
    public static void main(String[] args){
        int[] arr = {2, 2, 5, 7, 4, 6, 7, 2, 2};
        gitMissingNumber(arr);
    }

    public static void gitMissingNumber(int[] arr) {

        for ( int i = 0 ; i <arr.length  ; i++ ) {
            int count = 0;
            for ( int j = 0 ; j < arr.length; j++ ) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count %2 !=0)
                System.out.println(arr[i]);
        }
        
    }
}
