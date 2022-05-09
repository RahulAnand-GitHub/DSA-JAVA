package com.company.rahul;

public class Power {
    public static void main(String[] args){
        int n = 2;
        int p = 6;
        System.out.println(getPower(n, p));

    }

    public static int getPower(int n, int p) {
        int result = 1;
        for ( int i = 0 ; i <p ; i++ )
            result *=n;
        return result;
    }
}
