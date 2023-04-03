package com.company.최댓값만들기2;
//https://school.programmers.co.kr/learn/courses/30/lessons/120862

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] dot) {
        Arrays.sort(dot);

        return Math.max(dot[0] * dot[1], dot[dot.length - 1] * dot[dot.length - 2]);
    }
}