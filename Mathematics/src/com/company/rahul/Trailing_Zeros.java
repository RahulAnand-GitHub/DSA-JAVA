package com.company.rahul;

public class Trailing_Zeros {
    public static void main(String[] args){
        int n = 10;
        System.out.println("The factorial of "+n+" ="+Factorial.getFactorial(n));
        System.out.println("The number of trailing zeros in the factorial of "+n+" = "+Trailing(n));
    }

//    static int Trailing(int n) {
//        int fact = Factorial.getFactorial(n);
//        int counter =0;
//        while( fact % 10 == 0){
//            counter ++;
//            fact = fact / 10;
//        }
//        return counter;
//    }
    static int Trailing(int n) {
        int fact = Factorial.getFactorial(n);
        int counter =0;
        for ( int i = 5 ; i <=n ; i = i*5 ) {
          counter = counter + (n / i);
        }
        return counter;
    }
}
