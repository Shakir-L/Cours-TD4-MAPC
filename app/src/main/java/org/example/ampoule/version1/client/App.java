package org.example.ampoule.version1.client;

import org.example.ampoule.version1.api.Ampoule;
import org.example.ampoule.version1.api.EtatIllegal;

public class App {
    public static void main(String[] args) {
        // cas qui va bien
        Ampoule a = new Ampoule();
        try {
            a.allumer();
            a.eteindre();
        } catch (EtatIllegal e){
            System.out.println(e.getMessage());
        }
        // cas qui pose problème 1
        a = new Ampoule();
        try {
            a.allumer();
            a.allumer();
        } catch (EtatIllegal e){
            System.out.println(e.getMessage());
        }
        // cas qui pose problème 2
        a = new Ampoule();
        try {
            a.allumer();
            a.eteindre();
            a.eteindre();
        } catch (EtatIllegal e){
            System.out.println(e.getMessage());
        }

        //cas qui casse

        a = new Ampoule();
        try{
            a.allumer(); //0-> 1
            a.eteindre(); // 1 --> 1
            a.allumer(); // 1 --> 2
            a.eteindre();// 2--> 2
            a.allumer(); //2 --> 3
            a.eteindre(); // 3 --> 3
            a.allumer(); // on casse
            a.eteindre();
        } catch (EtatIllegal e){
            System.out.printf(e.getMessage());
        }

    }
}
