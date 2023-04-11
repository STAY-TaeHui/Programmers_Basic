package com.company.이진수더하기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120885

public class Main {
    public static void main(String[] args) {
        Solution.solution("1001","1111");
    }
}

class Solution {
    public static String solution(String bin1, String bin2) {

//        return Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));

        char[] arr1 = bin1.toCharArray();
        char[] arr2 = bin2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i= arr1.length-1; i>=0; i--){
            int sum = (arr1[i]-0)^(arr2[i]-0);
            sb.insert(0,sum);

            if(arr1[i] =='1' &&  arr2[i]=='1'){
                sb.insert(0,1);
            }

        }
        return sb.toString();
    }
}