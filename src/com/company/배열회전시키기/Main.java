package com.company.배열회전시키기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120844
public class Main {
    public static void main(String[] args) {
            Solution.solution(new int []{1,2,3},  "left");
    }
}

class Solution {
    public static int[] solution(int[] numbers, String direction) {
        int oriLength = numbers.length;
        int[] answer = new int[oriLength];

        if ("right".equals(direction)) {
            shift(1,0,oriLength-1,numbers,answer);
            answer[0] = numbers[oriLength-1];
        }
        else if ("left".equals(direction)) {
            shift(-1,1,oriLength,numbers,answer);
            answer[oriLength-1] = numbers[0];
        }

        return answer;
    }
    public static void shift(int shift, int start, int end, int[] numbers, int[]answer){
        for(int i=start; i<end; i++){
            answer[i+shift] = numbers[i];
        }
    }
}