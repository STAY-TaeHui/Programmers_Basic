package com.company.인덱스바꾸기;
//https://school.programmers.co.kr/learn/courses/30/lessons/120895

public class Main {
    public static void main(String[] args)
    {

    }
}

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();

        char[] myChars = my_string.toCharArray();
//        myChars[num1] = my_string.charAt(num1);
//        myChars[num2] = my_string.charAt(num2);

        char temp;
        temp = myChars[num1];
        myChars[num1] = myChars[num2];
        myChars[num2] = temp;

//        return String.valueOf(myChars);
        for(char c : myChars){
            sb.append(c);
        }

        return sb.toString();
    }
}