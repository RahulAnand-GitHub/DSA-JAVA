package com.company.rahul;

public class Power_Of_Two {
    public static void main(String[] args){
        int n = 256;
        System.out.println(getPower(n));
    }

    static boolean getPower(int n) {
        if(n==0)    return false;
        while(n!=1){
            if(n % 2 != 0)
                return false;
            n/=2;
        }

        return true;
    }
}
