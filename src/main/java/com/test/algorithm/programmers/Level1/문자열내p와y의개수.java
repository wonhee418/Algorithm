package com.test.algorithm.programmers.Level1;


/**
 * 문제 : 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
 *        s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 *        'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 *        단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *        예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 *       제한사항
 *       - 문자열 s의 길이 : 50 이하의 자연수
 *       - 문자열 s는 알파벳으로만 이루어져 있습니다.
 *
 *       입출력 예
*         s 	        answer
 *       "pPoooyY"	    true
 *
 */

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        s = s.toUpperCase();
        int y = 0; // y의 갯수를 담을 변수
        int p = 0; // p의 갯수를 담을 변수
        // s의 길이만큼 for문 돌리기
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P'){
                p++;
            } else if (s.charAt(i) == 'Y'){
                y++;
            }
        }
        return y == p;
    }

    public static void main(String[] args) {
        문자열내p와y의개수 method = new 문자열내p와y의개수();
        System.out.println(method.solution("pPoooyY"));
    }
}

