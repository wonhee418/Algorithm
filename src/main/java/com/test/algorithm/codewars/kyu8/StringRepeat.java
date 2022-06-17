package com.test.algorithm.codewars.kyu8;


/**
 * 문제 : Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
 *       주어진 문자열 s를 n만큼 반복하여 출력하여라.
 *
 *       입출력 예
 *       6, "I"     -> "IIIIII"
 *       5, "Hello" -> "HelloHelloHelloHelloHello"
 */
public class StringRepeat {
    public String solution(final int repeat, final String string) {
        String result = "";
        for(int i = 0; i < repeat; i++){
            result += string;
        }
        return result;
    }

    public static void main(String[] args) {
        StringRepeat method = new StringRepeat();
        System.out.println(method.solution(6, "I"));
    }
}

