package com.company.최빈값구하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120812

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Solution.solution(new int[]{1,2,3,3,3,4,4});
        //1,1
        //2,1
        //3,3
        //4,2
    }
}

class Solution {
    public static int solution(int[] array) {
        int maxKey = 0;
        int maxValue = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int a : array){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else{
                int v = map.get(a);
                map.put(a,v+1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer,Integer> entry = iterator.next();

            if (maxValue < entry.getValue())
            {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        int finalMaxValue = maxValue;
        long count = map.values().stream().filter(v -> v == finalMaxValue).count();
        if(count>1){
            return -1;
        }

        return maxKey;

        /* int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
*/
    }
}
