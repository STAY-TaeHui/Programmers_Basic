package com.company.피자나눠먹기2;
//https://school.programmers.co.kr/learn/courses/30/lessons/120815

public class Main {
}

class Solution {
    public int solution(int n) {
        int pieces = 6;
        int count = 1;
        while(((n*count) % pieces) !=0){
            count++;
        }
        return n*count / pieces;
    }
}