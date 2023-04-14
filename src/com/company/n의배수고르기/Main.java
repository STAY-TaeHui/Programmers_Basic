package com.company.n의배수고르기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120905

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    { Arrays.stream("123123".split(""))
            .sorted()
            .collect(Collectors.joining());
    }
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(v -> v%n != 0)
                .toArray();
    }
}