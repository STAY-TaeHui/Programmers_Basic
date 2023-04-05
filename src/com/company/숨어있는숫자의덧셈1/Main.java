package com.company.숨어있는숫자의덧셈1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120851

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution("aAb1B2cC34oOp");
    }
}

class Solution {
    public static int solution(String my_string) {
        int sum = Arrays.stream(my_string.split("[^0-9]+"))
            .filter(s -> !s.isEmpty() && s.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sum();
        return sum;
    }
}