package com.company.겹치는선분의길이;
//https://school.programmers.co.kr/learn/courses/30/lessons/120876

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
    }
}

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        List<Integer> collect = Arrays.stream(lines)
                .flatMapToInt(Arrays::stream)
                .boxed().sorted()
                .collect(Collectors.toList());
        int min = collect.get(0);
        int max = collect.get(collect.size()-1);
        int[] arr = new int[max - min + 1];

        Arrays.stream(lines)
                .forEach(line -> IntStream.rangeClosed(line[0],line[1]));


        return answer;
    }
}