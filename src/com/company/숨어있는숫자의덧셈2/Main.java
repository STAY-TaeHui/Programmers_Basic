package com.company.숨어있는숫자의덧셈2;
//https://school.programmers.co.kr/learn/courses/30/lessons/120864

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution("A1B2C3");
    }
}
class Solution {
    public static int solution(String my_string) {
        int sum = Arrays.stream(my_string.split("[^1-9]"))
            .filter(s -> !s.isEmpty() && s.matches("[1-9]+"))
            .mapToInt(Integer::parseInt)
            .sum();
        System.out.println(sum);
        return sum;
    }
}