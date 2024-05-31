package com.myblog1;

public class Test3 {
    public static void main(String[] args) {
        new Test3().test().example();
    }
    public Test3 test(){
        System.out.println(12);
        return new Test3();
    }
    public void example(){
        System.out.println("hello");
    }
}
