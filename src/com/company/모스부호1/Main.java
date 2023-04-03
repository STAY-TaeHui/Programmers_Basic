package com.company.모스부호1;
//https://school.programmers.co.kr/learn/courses/30/lessons/120838

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
    }
}
//5, 3, 1
class Solution {
    public String  solution(String letter) {
       String[] morse = {
           ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."};
       StringBuilder sb = new StringBuilder();

       String[] letters = letter.split(" ");

        int[] ints = Arrays.stream(letters).mapToInt(l -> Arrays.asList(morse).indexOf(l) + 97).toArray();
        for(int i : ints){
            sb.append((char)i);
        }
        return sb.toString();

    }
}