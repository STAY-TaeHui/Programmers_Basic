package com.company.배열자르기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120833

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
}

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        for(int i=0; num1<=num2; i++, num1++){
            answer[i] = numbers[num1];
        }
        return answer;
    }
    public int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }
    public int[] solution3(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1,num2).map(n -> numbers[n]).toArray();
    }
}