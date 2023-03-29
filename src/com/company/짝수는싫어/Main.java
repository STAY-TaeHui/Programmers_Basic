package com.company.짝수는싫어;
//https://school.programmers.co.kr/learn/courses/30/lessons/120831

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
}

class Solution {
    public int[] solution(int n) {

        IntStream.range(1, n)
                .filter(value -> value % 2 != 0)
                .collect();

        return answer;
    }
}