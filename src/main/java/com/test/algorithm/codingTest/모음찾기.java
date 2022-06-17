package com.test.algorithm.codingTest;

import java.util.regex.Pattern;

/**
 * 문제 : a, e, i, o, u가 몇개 들어 있는지 출력하는 함수를 작성해주세요.
 *
 * **예시**
 * - ex) abracadabra ⇒ 5
 */

public class 모음찾기 {
    public int solution(String str) {
        //입력받은 문자열을 하나씩 나누어줍니다.
        String[] strings = str.split("");
        //모음을 찾는 정규식을 pattern변수에 입력합니다. 대소문자 상관없이 찾기 위해 (?i)를 포함한 정규식을 작성합니다.
        String pattern = "(?i)[a.e.i.o.u]";
        //입력받은 문자중에 모음이 없을 경우를 대비하여 초기화를 0으로 잡아줍니다.
        int ressult = 0;
        //입력받은 문자열개수만큼 for문을 실행합니다.
        for (String s : strings) {
            //문자열 중에 모음이 있다면
            if (Pattern.matches(pattern, s)) {
                //모음이 있을때마다 카운팅을 하여 갯수를 체크합니다.
                ressult++;
            }
        }
        //카운팅 된 최종 갯수를 리턴합니다.
        return ressult;
    }


    public static void main(String[] args) {
        모음찾기 method = new 모음찾기();
        System.out.println(method.solution("ajwlAWiqwjoOPjiawPIJiwpj"));
    }
}

