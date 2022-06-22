package com.test.algorithm.codewars.kyu7;


import java.math.BigInteger;

/**
 * 문제 : In this simple kata you need to find how many dots are needed to construct nth triangle in the sequence of dot triangles.
 *       See next image to get the idea of the sequence:
 *       삼각형을 구성하는 데 필요한 점의 수를 찾아야 합니다 . 시퀀스에 대한 아이디어를 얻으려면 다음 이미지를 참조하십시오.
 *
 *       n삼각형을 구성하는데 필요한 점을 반환하는 함수를 작성해야 합니다.
 *
 *       입출력 예
 *
 *       1dot    3dots    6dots     10dots    ...
 *         *       *        *         *
 *         1      * *      * *       * *
 *                 2      * * *     * * *
 *                          3      * * * *
 *                                    4
 */
public class TrianglesFromDots {
    public static BigInteger numberOfDots(BigInteger n) {

        /** 1 ~ n 까지 더하는 공식을 이용하면 정답을 구할 수 있음,
        *   하지만 for문 while 문을 이용하기에는 int형이 필요,
        *   주어진 타입은 BigInteger 타입이기에 흔히 사용하는 공식으로는 해결 불가,
        *   n * (n + 1) / 2  << 기존에 for문을 이용하여 1 ~ n 까지 구하는공식과 같은 결과값을 나타내는 공식을 이용
        *   BigInteger 클래스 내부에서 제공하는 연산메소드를 활용하여 구현
        *   ※ BigInteger란? 큰 수를 다룰때 long자료형의 범위를 벗어날때 사용하며, 범위는 "무한대"로 사용할수 있는 자료형입니다.
        */

        return n.multiply(n.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));


    }

    public static void main(String[] args) {
        TrianglesFromDots method = new TrianglesFromDots();
        System.out.println(method.numberOfDots(BigInteger.valueOf(5)));
    }
}

