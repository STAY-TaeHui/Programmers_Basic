package com.company.등수매기기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120882

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
}
//[[80, 70], [90, 50], [40, 70], [50, 80]]
// 75,       70,        55,         65
//75, 70, 65, 55
// 0 1 2 3
//1, 2, 3 ,4
// 1          2       4           3


//[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]
//
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = {};

        List<Integer> collect = Arrays.stream(score)
            .mapToInt(sc -> Arrays.stream(sc).sum())
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

        answer = Arrays.stream(score)
            .mapToInt(sc -> collect.indexOf(Arrays.stream(sc).sum()) + 1)
            .toArray();
        return answer;
    }
}