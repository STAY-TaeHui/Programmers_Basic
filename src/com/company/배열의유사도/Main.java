package com.company.배열의유사도;
//https://school.programmers.co.kr/learn/courses/30/lessons/120903

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
}

class Solution {
    private static StringBuilder sb = new StringBuilder();
    public int solution(String[] s1, String[] s2) {
        List<String> bigger;
        List<String> smaller;

        if (s1.length > s2.length) {
            bigger = Arrays.asList(s1); // List.of(s1); //리스트 생성
            smaller = Arrays.asList(s2); // List.of(s2);//리스트 생성
        }
        else{
            bigger = Arrays.asList(s2);
            smaller = Arrays.asList(s1);
        }

        Collections.sort(bigger);
        Collections.sort(smaller);

        String str = bigger.stream()
                .map(s -> s+" ")
                .collect(Collectors.joining());

        return (int)smaller.stream()
                .filter(str::contains)
                .count();
    }
}