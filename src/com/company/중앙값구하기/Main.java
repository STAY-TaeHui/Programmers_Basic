package com.company.중앙값구하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120811

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public int solution(int[] array) {
        int center = array.length%2 !=0 ? array.length/2 : array.length/2-1;
        Arrays.sort(array);
        return array[center];
    }
}