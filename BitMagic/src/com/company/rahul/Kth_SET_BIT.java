package com.company.rahul;

public class Kth_SET_BIT {
    public static void main(String[] args){
        int n = 7, k = 2;
        if((n & (1 << (k-1))) != 0) System.out.println("YES.");
        else System.out.println("NO");
    }
}
