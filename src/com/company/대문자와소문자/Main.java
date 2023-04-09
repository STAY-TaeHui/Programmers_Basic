package com.company.대문자와소문자;
//https://school.programmers.co.kr/learn/courses/30/lessons/120893

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for(char c : my_string.toCharArray()){
            if(c<91) //Character.isLowerCase()
                sb.append((char)(c+32));
            else
                sb.append((char)(c-32));
        }
//        my_string.chars().mapToObj(c -> (char)(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c))).collect(Collectors.toList()).toString();
//        my_string.chars().mapToObj(c -> String.valueOf(Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c))).collect(Collectors.joining());
        return sb.toString();
    }
}