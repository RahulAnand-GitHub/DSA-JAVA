package com.company.rahul;

public class COUNT_Set_Bit {
    public static void main(String[] args){
        int n = 40;
        getCount(n);


    }

    public static void getCount(int n) {
        int count = 0;
        while( n > 0){
            n = n & (n-1);
            count ++;
        }
        System.out.println(count);
    }
}
