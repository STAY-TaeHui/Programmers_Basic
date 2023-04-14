package com.company.약수구하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120869

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int div = 1;
        while(div<=n){

            if(n%div == 0){
                answer.add(div);
                div++;
            }
            else{
                div++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}