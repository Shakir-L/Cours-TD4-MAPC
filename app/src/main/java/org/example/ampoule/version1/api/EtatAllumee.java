package org.example.ampoule.version1.api;

public class EtatAllumee implements EtatAmpoule {

    private int usage;

    public EtatAllumee(int usage) {
        this.usage = usage;
    }

    @Override
    public EtatAmpoule allumer() throws EtatIllegal {
        throw new EtatIllegal("ampoule déjà allumée");
    }
    
    @Override
    public EtatAmpoule eteindre() throws EtatIllegal {
        System.out.println("l'ampoule s'éteint");
        return new EtatEteinte(0);
    }
    
}
