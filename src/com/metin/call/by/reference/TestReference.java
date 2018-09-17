package com.metin.call.by.reference;

public class TestReference {

    public static void main(String[] args) {

        long[] numbers = {1, 3, 5};
        System.out.println("##main method## {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + "}");

        changeNumber(numbers);
        System.out.println("##again main method## {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + "}");
    }

    private static void changeNumber(long[] numbers) {

        // numbers = new long[3]; // Eğer orijinal değerin değişmesini istemiyorsak, new komutu ile yeniden yaratmalıyız.
        numbers[0] = 10;
        numbers[2] = 20;
        System.out.println("##changeNumber## {" + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + "}");
    }
}
