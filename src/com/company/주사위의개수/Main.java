package com.company.주사위의개수;
//https://school.programmers.co.kr/learn/courses/30/lessons/120845

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] box, int n) {
        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;

        return x*y*z;
    }
}