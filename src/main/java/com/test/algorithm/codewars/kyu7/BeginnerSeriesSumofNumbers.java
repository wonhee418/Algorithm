package com.test.algorithm.codewars.kyu7;


/**
 * 문제 : Given two integers a and b, which can be positive or negative,
 *       find the sum of all the integers between and including them and return it.
 *       If the two numbers are equal return a or b.
 *       정수 a와 b를 받아 두 수를 포함한 두 숫자 사이의 합을 구하라.
 *       두 수가 같다면 정수 a 혹은 b를 리턴한다.
 *       a와 b는 마이너스 값을 가질 수 있고 a의 값이 b보다 클 수 있다.
 *
 *       입출력 예
 *       (1, 0) --> 1 (1 + 0 = 1)
 *       (1, 2) --> 3 (1 + 2 = 3)
 *       (0, 1) --> 1 (0 + 1 = 1)
 *       (1, 1) --> 1 (1 since both are same)
 *       (-1, 0) --> -1 (-1 + 0 = -1)
 *       (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 */
public class BeginnerSeriesSumofNumbers {
    public int solution(int a , int b) {
        if (b < a) {
            int sum = b;
            for (int i = b + 1; i <= a; i++) {
                sum += i;
            }
            return sum;
        } else {
            int sum = a;
            for(int i = a+1; i <= b ; i++){
                sum+= i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        BeginnerSeriesSumofNumbers method = new BeginnerSeriesSumofNumbers();
        System.out.println(method.solution(0,-2));
    }
}

