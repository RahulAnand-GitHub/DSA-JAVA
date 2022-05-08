package com.company.rahul;

public class SieveOfEratosthenes {
    public static void main(String[] args){
        int n = 20;
        getPrime(n);

    }

    static void getPrime(int n) {
        for ( int i = 2 ; i <=n ; i++ ) {
            if(PrimeNumber.getSignal(i))
                System.out.println(i);
        }
    }
}
