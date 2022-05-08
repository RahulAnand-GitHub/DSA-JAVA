package com.company.rahul;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n =45654;
        System.out.println(Palindrome(n));
    }


    static boolean Palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp!=0){
            int ld = temp %10;
            rev = rev * 10 + ld;
            temp /=10;

        }
        return (rev==n);
    }
}
