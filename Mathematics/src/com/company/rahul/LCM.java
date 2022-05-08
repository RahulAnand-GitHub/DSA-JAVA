package com.company.rahul;


public class LCM {
    public static void main(String[] args){
        int a = 4, b = 6;
        System.out.println(getLCM(a, b));
    }

    static int getLCM(int a, int b) {
//        int c = a>b?a:b;
//        while(true){
//            if(c%a==0 && c%b==0){
//                return c;
//            }
//            c++;
//        }
        return (a*b) / getGCD(a,b);
    }
    static int getGCD(int a,int b){
        if(b==0) return a;
        return getGCD(b, a%b);
    }
}
