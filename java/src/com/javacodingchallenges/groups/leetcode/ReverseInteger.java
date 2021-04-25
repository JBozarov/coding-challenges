package com.javacodingchallenges.groups.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        int i = reverse(1534236469);
        System.out.println(i);
    }


    public static int reverse(int x) {
        int result = 0;
        if (x > 0) {
            result = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        } else {
            int temp = x * -1;
            result = Integer.parseInt(new StringBuilder(String.valueOf(temp)).reverse().toString());
        }
        return x >= 0 ? result : -result;
    }
}
