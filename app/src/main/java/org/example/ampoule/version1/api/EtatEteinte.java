package org.example.ampoule.version1.api;

public class EtatEteinte implements EtatAmpoule {

    private int usages;

    public EtatEteinte(int usages){
        this.usages = usages;
    }

    @Override
    public EtatAmpoule allumer() throws EtatIllegal {
        if(usages<3) {
            System.out.println("l'ampoule s'allume");
            return new EtatAllumee(usages+1);
        } else {
            System.out.println("L'ampoule se casse");
            return new EtatCassee();
        }
    }

    @Override
    public EtatAmpoule eteindre() throws EtatIllegal {
        throw new EtatIllegal("ampoule déjà éteinte");
    }
    
}
