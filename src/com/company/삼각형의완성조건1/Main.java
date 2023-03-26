package com.company.삼각형의완성조건1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120889

public class Main {
}

class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int total = 0;

        for(int side : sides){
            total +=side;
            max = Math.max(max,side);
        }

        return (total-max) > max ? 1 : 2;

    }
}