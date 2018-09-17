package com.metin.primitive.reference.type.performance;

public class TestPerformance {

    public static void main(String[] args) {

        long[] primitiveLongs = new long[10000000];

        long startTime = System.nanoTime();
        for (int i=0;i<10000000;i++){
            primitiveLongs[i] = i;
        }
        long lastTime = System.nanoTime();
        System.out.println("Primitive Type ==> " + (lastTime - startTime));

        Long[] referenceLongs = new Long[10000000];
        long startTime2 = System.nanoTime();
        for (int i=0;i<10000000;i++){
            referenceLongs[i] = new Long(i);
        }
        long lastTime2 = System.nanoTime();
        System.out.println("Reference Type ==> " + (lastTime2 - startTime2));

        System.out.println("Object type yaklaşık " + ((lastTime2-startTime2)/(lastTime-startTime)) + " kat daha büyüktür.");
    }
}
