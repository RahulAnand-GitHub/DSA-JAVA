package com.company.rahul;

public class Power {
    public static void main(String[] args){
        int n = 2;
        int p = 7;
        System.out.println(getPower(n, p));

    }

    public static int getPower(int n, int p) {
//        int result = 1;
//        for ( int i = 0 ; i <p ; i++ )
//            result *=n;
//        return result;
        if(p==0)
            return 1;
        int temp = getPower(n, p/2);
        temp = temp *  temp;
        if(p%2==0)  return temp;
        else    return temp * n;
    }
}
