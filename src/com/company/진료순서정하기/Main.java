package com.company.진료순서정하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120835

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(new int[]{30, 10, 23, 6, 100});
    }
}
//[30, 10, 23, 6, 100]  // 1, 2, 3, 4, 5
//100, 30, 23, 10, 6  //5, 1, 3, 2, 4
class Solution {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<emergency.length; i++){
            map.put(emergency[i],i);
            list.add(emergency[i]);
        }
        list.sort(Collections.reverseOrder());

        for(int i=0; i<list.size(); i++){
            answer[map.get(list.get(i))] =i+1;
        }

        return answer;
    }
}