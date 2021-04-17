package com.javacodingchallenges.groups.hackerrank.string;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reversedA = new StringBuilder(A).reverse().toString();

        System.out.println(A.equals(reversedA) ? "Yes" : "No");
    }
}
