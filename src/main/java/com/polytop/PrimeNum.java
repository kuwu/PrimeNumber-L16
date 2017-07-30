package com.polytop;

import java.util.Scanner;

public class PrimeNum {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    PNumber pNumber = new PNumber();
    pNumber.computePrimes();

    System.out.println("Please enter and number between 1 and 100");
    int input = scan.nextInt();

    pNumber.priNum(input);
    System.out.println(pNumber.mPrimes.get(input - 1));


  }


}
