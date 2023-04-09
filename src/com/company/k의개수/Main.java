package com.company.k의개수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120887

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        IntStream.rangeClosed(1,13)
                .filter(n -> String.valueOf(n).contains(1+""))
                .forEach(System.out::println);
    }
}

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++){
            answer +=Arrays.stream(String.valueOf(i).split(""))
                    .filter(v -> v.equals(String.valueOf(k)))
                    .count();
        }
        return answer;
//        return 0;
    }
}