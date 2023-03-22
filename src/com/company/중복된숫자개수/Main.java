package com.company.중복된숫자개수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120583

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int a : array){
            if (a == n) {
                answer++;
            }
        }
        return answer;
    }
}