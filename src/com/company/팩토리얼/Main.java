package com.company.팩토리얼;
//https://school.programmers.co.kr/learn/courses/30/lessons/120848

public class Main {
}

class Solution {
    public static int solution(int n) {
        int answer = 1;
        int f = 1;
        do{
            f++;
            answer *= f;
        }
        while (answer <= n);
        return f-1;
    }
}