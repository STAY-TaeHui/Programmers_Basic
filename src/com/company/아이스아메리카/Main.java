package com.company.아이스아메리카;
//https://school.programmers.co.kr/learn/courses/30/lessons/120819

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coast = 5500;

        answer[0] = money/5500;
        answer[1] = money - answer[0]*5500;

        return answer;
    }
}