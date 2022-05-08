package com.company.rahul;

public class Factorial {
    public static void main(String[] args){
        int n = 6;
        System.out.println("Factorial  - "+getFactorial(n));
    }

//    static int getFactorial(int n) {
//        int base = 1;
//        for ( int i = 2; i <= 6; i++ ) {
//            base = base *i;
//        }
//        return base;
//    }



//    Recursive approach
    static int getFactorial(int n) {
        if (n==0)   return 1;
        return n * getFactorial(n-1);
    }
}