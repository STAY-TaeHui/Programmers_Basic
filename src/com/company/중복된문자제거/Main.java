package com.company.중복된문자제거;
//https://school.programmers.co.kr/learn/courses/30/lessons/120888

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public String solution(String my_string) {
//        StringBuilder sb = new StringBuilder();
//        Arrays.stream(my_string.split(""))
//                .forEach(v -> {
//                    if(!sb.toString().contains(v)){
//                        sb.append(v);
//                    }
//                });
//        return sb.toString();
        return my_string.chars()
                .mapToObj(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
    }
}