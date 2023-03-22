package com.company.배열의평균값;
//https://school.programmers.co.kr/learn/courses/30/lessons/120817

public class Main {
}

class Solution {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int num : numbers){
            answer+=num;
        }
        return answer/numbers.length;
    }
}