package com.company.피자나눠먹기1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120814

import javax.swing.*;

public class Main {
}

class Solution {
    public static int solution(int n) {
        final int pieces = 7;
        int answer = 0;
        if (n % pieces == 0) {
            answer = n/pieces;
        }
        else
        {
            answer = n/pieces +1;
        }
        return answer;
    }
}