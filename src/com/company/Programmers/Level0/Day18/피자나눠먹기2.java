package com.company.Programmers.Level0.Day18;

import java.util.Arrays;

public class 피자나눠먹기2 {

    public static void main(String[] args) {

        int a = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 0;
        solution(a, numlist);
    }

    public static int[] solution(int n, int[] numlist) {

        return Arrays.stream(numlist).filter(s -> s % n == 0).toArray();
    }
}

