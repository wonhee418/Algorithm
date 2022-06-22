package com.test.algorithm.codewars.kyu8;


import java.util.Arrays;

/**
 * 문제 : You were camping with your friends far away from home,
 *       but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away!
 *       You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.
 *       Considering these factors, write a function that tells you if it is possible to get to the pump or not.
 *       Function should return true if it is possible and false if not.
 *
 *
 */
public class WillYouMakeIt {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        // 남은거리 distanceToPump 50
        // 남은 갤런 fuelLeft 2
        // 갤런당 갈 수 있는 거리 mpg 25

        return mpg * fuelLeft >= distanceToPump;

    }

    public static void main(String[] args) {
        WillYouMakeIt method = new WillYouMakeIt();
        System.out.println(method.zeroFuel(50, 25, 2));
    }
}

