package com.company.rahul;

public class SquareRoot {
    public static void main(String[] args){
        int n = 5;
        System.out.println(getSquareRoot(n));
    }

    public static int getSquareRoot(int n) {
        int i = 1;
        int result = 1;
        while(result<= n){
            i++;
            result = i*i;
        }
        return i - 1;
    }
}
