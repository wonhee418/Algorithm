package com.test.algorithm.codewars.kyu8;



/**
 * 문제 : We need a function that can transform a string into a number.
 *       What ways of achieving this do you know?
 *       Note: Don't worry, all inputs will be strings,
 *       and every string is a perfectly valid representation of an integral number.

 */
public class ConvertaStringtoaNumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        ConvertaStringtoaNumber method = new ConvertaStringtoaNumber();
        System.out.println(method.stringToNumber("1405"));
    }
}

