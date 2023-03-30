package com.company.이차원만들기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120842

import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        System.out.println(Solution.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948},3));

    }
}

class Solution {
    public static int[][] solution(int[] num_list, int n) {
        int rows = num_list.length/n;
        int[][] answer = new int[rows][n];
        int index = 0;
        for(int i=0; index<num_list.length; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[index];
                index++;
            }
        }
        /*int length = num_list.length;

        answer = new int[length/n][n];

        for(int i=0; i<length; i++){
            answer[i/n][i%n]=num_list[i];
        }*/

        return answer;
    }
}