package com.metin.trick;

public class TestTrick {

    public static void main(String[] args) {

        String name = "Metin";
        System.out.println("##main method## " + name);

        changeName(name);

        System.out.println("##again main method## " + name);
    }

    private static void changeName(String name) {

        name = "Yusuf";
        System.out.println("##changeName## " + name);
    }

}
