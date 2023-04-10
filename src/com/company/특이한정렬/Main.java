package com.company.특이한정렬;
//https://school.programmers.co.kr/learn/courses/30/lessons/120880


public class Main {
    public static void main(String[] args) {
        Solution.solution(new int[] {1, 2, 3, 4, 5, 6}, 4);
    }
}
//[10000,20,36,47,40,6,10,7000]
class Solution {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        for(int i=0; i<=numlist.length-2; i++){
            for(int j=i; j<numlist.length-1; j++){
                answer[j] = Math.abs(numlist[j]-n)<Math.abs(numlist[j+1]-n) ? numlist[j] : numlist[j+1];
            }
        }





        return answer;
    }
}