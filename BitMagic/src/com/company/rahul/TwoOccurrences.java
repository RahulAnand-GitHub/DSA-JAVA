package com.company.rahul;

public class TwoOccurrences {
    public static void main(String[] args){
        int[] arr = {3, 4, 3, 4, 8, 4, 4, 32, 7, 7};
        gitMissingNumber(arr);
    }

    public static void gitMissingNumber(int[] arr) {

//

//        Optimised Solution
        int res1 = 0, res2 = 0, xor = 0;
        for ( int i = 0 ; i <arr.length ; i++ ) {
            xor = xor ^ arr[i];
        }
        int sn = xor & ~(xor-1);
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1+" "+res2);
    }
}
