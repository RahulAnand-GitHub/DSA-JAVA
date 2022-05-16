package com.company.rahul;

public class Power {
    public static void main(String[] args){
        int n = 2;
        int p = 7;
        System.out.println(getPower(n, p));

    }

    public static int getPower(int n, int p) {
//        Naive Solution

//        int result = 1;
//        for ( int i = 0 ; i <p ; i++ )
//            result *=n;
//        return result;

//        Recursive Solution
//        if(p==0)
//            return 1;
//        int temp = getPower(n, p/2);
//        temp = temp *  temp;
//        if(p%2==0)  return temp;
//        else    return temp * n;

//        Iterative Solution with time complexity: O(log n)
        int result = 1;
        while(p > 0){
            if( p % 2 != 0)
                result *= n;
            n *= n;
            p = p / 2;
        }
        return  result;

    }
}
