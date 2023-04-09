package com.company.가까운수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120839


public class Main {
    public static void main(String[] args)
    {
    }
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        int gap = 100;

        for(int i=0; i<array.length; i++){
            if(Math.abs(array[i] - n)<=gap){
                if(gap == Math.abs(array[i] - n)){
                    answer = Math.min(answer,array[i]);
                }
                else
                    answer = array[i];

                gap = Math.abs(array[i] - n);

            }
        }
        return answer;
    }
}