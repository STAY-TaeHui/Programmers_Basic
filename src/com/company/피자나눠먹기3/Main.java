package com.company.피자나눠먹기3;
//https://school.programmers.co.kr/learn/courses/30/lessons/120816

public class Main {
}

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        if (n % slice == 0) {
            answer=n/slice;
        }else{
            answer = n/slice +1;
        }


        return answer;
    }
}