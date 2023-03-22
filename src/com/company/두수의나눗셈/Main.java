package com.company.두수의나눗셈;
//https://school.programmers.co.kr/learn/courses/30/lessons/120806

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(7, 3));
    }
}

class Solution {
    public static int solution(int num1, int num2) {
        return (int)(((double)num1/(double)num2)*(double)1000);
    }
}