package com.metin.detail.example;

import com.metin.domain.Personel;

public class DetailExample {

    public static void main(String[] args) {

        int a = 10;
        int b = a; // "a" değişkeninin değeri "b" değişkenine kopyalanır.
        System.out.println("a ==> " + a);
        System.out.println("b ==> " + b);
        System.out.println("-----");

        b = 5;
        System.out.println("a ==> " + a); // "b" değiştirildiğinde "a" bundan etkilenmez çünkü primitive type'tır. "a" değişkeninin değeri hala 10'dur.
        System.out.println("b ==> " + b);
        System.out.println("-----");

        Personel p1 = new Personel("Metin");
        Personel p2 = p1; // Personel reference type'dır. "p2" ve "p1" aynı adresi tutar.

        System.out.println("p1.getName() ==> " + p1.getName()); // Aynı adresi gösterdiklerinden "p1" ve "p2"nin name bilgisi Metin'dir.
        System.out.println("p2.getName() ==> " + p2.getName());
        System.out.println("-----");

        p2.setName("Yusuf"); // "p1" ve "p2" aynı adresi gösterdiklerinde dolayı "p2" name değerini değiştirdiğinde "p1"in de name değeri değişecektir.

        System.out.println("p1.getName() ==> " + p1.getName());
        System.out.println("p2.getName() ==> " + p2.getName());
        System.out.println("-----");

        // Eğer "p1" ve "p2" nin farklı adresleri göstermesini istersek "p1" veya "p2" için new komutu kullanmalıyız.

        p2 = new Personel("Metin");

        System.out.println("p1.getName() ==> " + p1.getName());
        System.out.println("p2.getName() ==> " + p2.getName());
    }
}
