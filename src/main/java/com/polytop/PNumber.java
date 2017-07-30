package com.polytop;

/*
*  TDD for finding prime numbers and calling for their place, for example:
* the 6th prime number is 13.
* created by kuwu on 7/28/2017
*
 */


import java.util.ArrayList;
import java.util.Scanner;

public class PNumber {
  Scanner scan = new Scanner(System.in);


  final static Integer upperBounds = 1000;

  public int getMaxIndex() {
    return mPrimes.size();
  }

  public ArrayList<Integer> mPrimes = new ArrayList<Integer>();


  public boolean priNum(int input) {

    //check if input is a multiple of 2
    if ((input >= 1) && (input <= getMaxIndex())) {

     return true;
    } else {
      System.out.println("Please re-enter a number between 1 and 100");
    }
    return false;
  }

  private boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    if (n % 2 == 0) {
      return n == 2;
    }
//    checking for problem with no = before (int)
//    if (n == 9) {
//        n = n;
//    }
    for (int i = 3; i <= (int) (Math.sqrt( n ) + 0.5); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public void computePrimes() {

    for (int i = 0; i <= upperBounds; i++) {

      if (isPrime( i )) {

        mPrimes.add( i );
      }

    }
       // TODO finish vaildation
  }

}