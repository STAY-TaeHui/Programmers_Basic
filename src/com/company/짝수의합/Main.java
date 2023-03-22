package com.company.짝수의합;
//https://school.programmers.co.kr/learn/courses/30/lessons/120831

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(0));
    }
}

class Solution {
    public static int solution(int n) {
        int answer = 0;
        int count = 2;

        if (n < 2) {
            return 0;
        }else{
            while (n >= count) {
                answer+=count;
                count+=2;
            }
        }

        return answer;
    }
}