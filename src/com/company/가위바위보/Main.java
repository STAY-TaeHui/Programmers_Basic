package com.company.가위바위보;
//https://school.programmers.co.kr/learn/courses/30/lessons/120839

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
    }
}
//가위 2
//바위 0
//보   5
class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Character> map = new HashMap<>();
        map.put('2','0');
        map.put('0','5');
        map.put('5','2');


        char[] chars = rsp.toCharArray();
        for(char c : chars){
            sb.append(map.get(c));
        }

        return sb.toString();
    }
}