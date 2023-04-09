package com.company.삼육구게임;
//https://school.programmers.co.kr/learn/courses/30/lessons/120891

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int order) {
        return (int)Arrays.stream(String.valueOf(order).split(""))
                .filter(v -> Integer.parseInt(v) % 3 == 0 && !"0".equals(v))
                .mapToInt(Integer::parseInt)
                .count();
    }
}