package org.example.ampoule.version2.api;


import io.vavr.control.Try;

public class EtatCassee implements EtatAmpoule {
    private EtatCassee(){}

    public static final EtatAmpoule INSTANCE = new EtatCassee();

    @Override
    public Try<Integer> allumer(Ampoule a){
        return Try.failure(new EtatIllegal("ampoule cassée"));
    }

    @Override
    public Try<Void> eteindre(Ampoule a){
        return Try.failure(new EtatIllegal("ampoule cassée"));
    }
}
