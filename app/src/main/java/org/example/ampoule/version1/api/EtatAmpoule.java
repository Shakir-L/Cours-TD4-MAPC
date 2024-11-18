package org.example.ampoule.version1.api;

public interface EtatAmpoule {
    EtatAmpoule allumer() throws EtatIllegal;
    EtatAmpoule eteindre() throws EtatIllegal;
}
