package com.driver;
public class Product{
  public int product(int x, int y) {
    System.out.println(x*y);
  }
  public int product(int x, int y, int z) {
     System.out.println(x*y*z);
  }
  public double product(double x, double y) {
     System.out.println(x*y);
  }
}
public class Main {
public static void main (Strings args[]){
  Product p =new Product();
  p.product(2,3);
   p.product(2,3,4);
   p.product(3.45,44.4);
}
  
}
