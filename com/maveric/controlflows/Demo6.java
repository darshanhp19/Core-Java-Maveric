package com.maveric.controlflows;

public class Demo6 {

  public static void main(String[] args) {
    int arr[]={12,23,2,44,123};
    for(int x:arr){
      if(x==44){
        continue;
      }
      System.out.println(x);
    }
  }
}
