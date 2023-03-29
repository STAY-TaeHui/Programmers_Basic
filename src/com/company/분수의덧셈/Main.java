package com.company.분수의덧셈;
//https://school.programmers.co.kr/learn/courses/30/lessons/120808

public class Main {
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int gcdResult = 0;

        gcdResult = gcd(denom1,denom2);

        answer[0] = ((numer1*denom2)+(numer2*denom1)) / gcdResult;
        answer[1] = (denom1*denom2) / gcdResult;
        return answer;
    }
    public int gcd(int a, int b){
        while (b != 0) {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}