package com.maveric.controlflows;

public class Demo12 {

  public static void main(String[] args) {
    int x=1;
    while (x<50){
      if (x==26) {
        break;
      }
      System.out.println(x);

      x++;
    }
  }
}
