package com.company.영어가싫어요;
//https://school.programmers.co.kr/learn/courses/30/lessons/120894

public class Main {
    public static void main(String[] args)
    {
        Solution.solution("onetwothreefourfivesixseveneightnine");
    }
}

class Solution {
    public static long solution(String numbers) {
        long answer = 0;
        String[] numArrays = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<numArrays.length; i++){
            numbers = numbers.replace(numArrays[i],"");
        }
        return Long.parseLong(numbers);
    }
}