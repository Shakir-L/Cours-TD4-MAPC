package org.example.ampoule.version1.api;

public class EtatCassee implements EtatAmpoule {

    @Override
    public EtatAmpoule allumer() throws EtatIllegal{
        throw new EtatIllegal("ampoule cassée");
    }

    @Override
    public EtatAmpoule eteindre() throws EtatIllegal{
        throw new EtatIllegal("ampoule cassée");
    }
}
