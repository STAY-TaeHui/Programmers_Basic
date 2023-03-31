package com.company.배열두개만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120809

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] numbers) {

        return Arrays.stream(numbers)
                .map(num -> num * 2)
                .toArray();
    }
}