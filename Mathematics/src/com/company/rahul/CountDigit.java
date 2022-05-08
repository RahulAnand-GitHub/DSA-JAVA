package com.company.rahul;

public class CountDigit {

    public static void main(String[] args) {
        int n = 588865544;
        System.out.println(Count(n));
    }
    static int Count(int n){
        int counter = 0;
        while(n!=0){
            n = n/10;
            counter++;
       }
        return counter;
    }
}
