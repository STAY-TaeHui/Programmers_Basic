package com.company.로그인성공;
//https://school.programmers.co.kr/learn/courses/30/lessons/120883

public class Main {
}
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                if(!id_pw[1].equals(db[i][1])){
                    answer =  "wrong pw";
                    break;
                }
                else{
                    answer = "login";
                    break;
                }
            }
            answer = "fail";
        }
        return answer;
    }
}