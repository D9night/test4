package com.liuxs.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lxs
 */
public class Hello {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }

    private static void test6() {
        String tab1 = "";
        System.out.println("tab1 = " + tab1);
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        if (a != null) {
            for (String s : a) {
                System.out.println(s);
            }
        }
    }

    private static void test5() {
        System.out.println("unversioned Files");
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
