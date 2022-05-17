package com.company.rahul;

import java.sql.SQLOutput;

public class COUNT_Set_Bit {
    static int[] table = new int[256];


    public static void initialize(){
        table[0] = 0;
        for ( int i = 0 ; i < 256 ; i++ ) {
            table[i] = (i & 1) + table[ i / 2];
        }
    }
    public static int getCount(int n) {
//        int count = 0;
//        while( n > 0){
//            n = n & (n-1);
//            count ++;
//        }
//        System.out.println(count);


//        Lookup Table method
        return table[n & 0xff] + table[(n >> 8) & 0xff] + table[(n >> 16) & 0xff] + table[n >> 24];
    }
    public static void main(String[] args){
        initialize();
        int n = 7;
        System.out.println(getCount(n));
    }
}
