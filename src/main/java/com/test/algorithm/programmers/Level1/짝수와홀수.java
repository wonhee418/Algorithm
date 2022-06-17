package com.test.algorithm.programmers.Level1;


/**
 * 문제 : 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * **예시**
 *      num	    return
 *      3   	"Odd"
 *      4	    "Even"
 */

public class 짝수와홀수 {
    public String solution(int num) {
        return num%2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        짝수와홀수 method = new 짝수와홀수();
        System.out.println(method.solution(23));
    }
}

