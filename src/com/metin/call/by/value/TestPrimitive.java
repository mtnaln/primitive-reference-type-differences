package com.metin.call.by.value;

public class TestPrimitive {

    public static void main(String[] args) {

        int number = 20;
        System.out.println("##main method## " + number);

        changeNumber(number);
        System.out.println("##again main method## " + number);
    }

    private static void changeNumber(int number) {

        number = 40;
        System.out.println("##changeNumber method## " + number);
    }
}
