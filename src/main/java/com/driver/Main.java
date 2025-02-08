package com.driver;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        A a = (A) b;
        System.out.println(a.meth());
        System.out.println(b.meth());
    }
  
}