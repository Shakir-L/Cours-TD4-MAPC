package org.example.ampoule.version2.client;

import java.util.function.Consumer;

import org.example.ampoule.version1.api.EtatIllegal;
import org.example.ampoule.version2.api.Ampoule;

import io.vavr.control.Option;

public class App {

    private static final Consumer<String> afficheur = System.out::println;

    public static void main(String[] args) {
        final int LUMEN = 2500;
        Ampoule a;
        Option<Integer> lumens;

        // cas qui va bien
        a = new Ampoule(afficheur, LUMEN);
        lumens = a.allumer();
        System.out.println(lumens + " lumens");
        a.eteindre();

        // cas qui pose problème 1
        a = new Ampoule(afficheur, LUMEN);
        lumens = a.allumer();
        System.out.println(lumens + " lumens");
        a.allumer();

        // cas qui pose problème 2
        a = new Ampoule(afficheur, LUMEN);
        lumens = a.allumer();
        System.out.println(lumens + " lumens");
        a.eteindre();
        a.eteindre();

        a = new Ampoule(afficheur, LUMEN);
            a.allumer(); //0-> 1
            a.eteindre(); // 1 --> 1
            a.allumer(); // 1 --> 2
            a.eteindre();// 2--> 2
            a.allumer(); //2 --> 3
            a.eteindre(); // 3 --> 3
            a.allumer(); // on casse
            a.eteindre();

    }
}
