package com.company.머쓱키큰;
//https://school.programmers.co.kr/learn/courses/30/lessons/120585

import java.util.Arrays;
public class Main {
}

class Solution {
    public int solution(int[] array, int height) {

//        return Arrays.stream(array).filter(h->h>height).toArray().length;
        return (int) Arrays.stream(array).filter(h->h>height).count();

    }
}