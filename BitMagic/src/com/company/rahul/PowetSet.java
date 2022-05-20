package com.company.rahul;

public class PowetSet {
    public static void main(String[] args){
        String str = "abc";
        getPowerSet(str);
    }

    static void getPowerSet(String str) {
        int n = str.length();
        int powerSize = (int) Math.pow(2, n);
        for ( int counter = 0 ; counter < powerSize ; counter++ ) {
            for ( int i = 0 ; i < n ; i++ ) {
                if( (counter & (1<< i))!=0) System.out.print(str.charAt(i));
            }
            System.out.println();
        }

    }
}
