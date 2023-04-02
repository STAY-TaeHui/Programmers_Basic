package com.company.배열뒤집기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120821

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }

    public int[] solution2(int[] num_list) {
        List<Integer> collect = Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(collect);

        return collect.stream().mapToInt(Integer::intValue).toArray();

    }
}