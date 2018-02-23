package com.liuxs.test3;

public class Hello {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    private static void test4() {
        System.out.println("change List");
    }

    private static void test3() {
        System.out.println("only change commit");
    }

    private static void test2() {
        System.out.println("git change Version");
    }

    private static void test1(){
        System.out.println("hello ,IDEA");
    }

}
