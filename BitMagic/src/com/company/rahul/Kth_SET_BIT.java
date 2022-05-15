package com.company.rahul;

public class Kth_SET_BIT {
    public static void main(String[] args){
        int n = 5, k = 6;
//        if((n & (1 << (k-1))) != 0) System.out.println("YES.");
//        else System.out.println("NO");


        // second approach.
        if((n>>(k-1)&1)==1) System.out.println("Yes.");
        else System.out.println("No.");

    }
}
