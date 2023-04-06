package com.company.문자열정렬하기1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120850

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer = Arrays.stream(my_string.split(""))
            .filter(s -> s.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
        return answer;
    }
}