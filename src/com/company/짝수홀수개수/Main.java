package com.company.짝수홀수개수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120824

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};

        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 != 0){
                answer[1]+=1;
            }else
                answer[0] +=1;
        }
        return answer;
    }
    public int[] solution2(int[] num_list){
        int count = (int) Arrays.stream(num_list)
                .filter(n -> n % 2 == 0).count();

        return new int[] {count, num_list.length-count};
    }
}