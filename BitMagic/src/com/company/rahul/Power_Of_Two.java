package com.company.rahul;

public class Power_Of_Two {
    public static void main(String[] args){
        int n = 256;
        System.out.println(getPower(n));
    }

    static boolean getPower(int n) {
//        if(n==0)    return false;
//        while(n!=1){
//            if(n % 2 != 0)
//                return false;
//            n/=2;
//        }
//
//        return true;

//        Brian Kernighan's algorithm method.

        if(n==0) return false;
//        return ((n & (n-1)) == 0);
        return(n!=0)&&((n & (n-1))==0);

    }
}
