package com.company.양꼬치;
//https://school.programmers.co.kr/learn/courses/30/lessons/120830

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.solution(64,6));
    }
}

class Solution {
    public static int solution(int n, int k) {
        int stick = 12000;
        int drink = 2000;

        return (stick*n) + (drink*k) - ((n/10)*drink);
    }
}