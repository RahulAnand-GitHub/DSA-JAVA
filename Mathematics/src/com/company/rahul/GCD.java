package com.company.rahul;

public class GCD {
    public static void main(String[] arr){
        int a = 100, b = 46;
        System.out.println(getGCD(a,b));
    }

//    Bruteforce Solution

//    static int getGCD(int a, int b) {
////        int c = a > b ? b : a;
//        int c = Math.min(a,b);
//        while(c > 0){
//            if(a % c == 0 && b % c == 0) break;
//            c--;
//        }
//        return c;
//    }
//}



//    Euclidean Algorithm
    static int getGCD( int a, int b){
        if (b==0)
            return a;
        return getGCD(b, a%b);
    }




}