You will be given an array and a limit value. You must check that all values in the array are below or equal to the limit value. 
If they are, return true. Else, return false




package com.javacodingchallenges.groups.codewars;

import java.util.Arrays;

public class SmallEnough {
    public static void main(String[] args) {

        System.out.println(smallEnough(new int[] { 66, 1041 }, 200));
    }

    public static boolean smallEnough(int[] a, int limit){
        return Arrays.stream(a).filter(v -> v <= limit).count() == a.length;
    }
}
