package com.maveric.controlflows;

public class Demo2 {

  public static void main(String[] args) {
    int year=2012;
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
      System.out.println("Leap year");
    }
    else{
      System.out.println("not a leap year");
    }
  }
}
