package com.test.algorithm.codewars.kyu8;



/**
 * 문제 : The code provided is supposed replace all the dots . in the specified String str with dashes -
 *       But it's not working properly.
 *       제공된 코드는 지정된 문자열의 모든 점(.)을 대시(-) 로 대체해야 합니다.
 *       하지만 제대로 작동하지 않습니다.
 *
 *       Task
 *       Fix the bug so we can all go home early.
 *       우리 모두가 일찍 집에 갈 수 있도록 버그를 수정하십시오.
 *
 *       Notes
 *       String str will never be null.
 *       문자열 str은 절대 null이 아닙니다.

 */
public class FIXMEReplacealldots {
    public static String stringToNumber(String str) {
        // 제공된 코드 => return str.replaceAll(".", "-");
        return str.replace(".", "-");
    }

    public static void main(String[] args) {
        FIXMEReplacealldots method = new FIXMEReplacealldots();
        System.out.println(method.stringToNumber("one.two.three"));
    }
}

