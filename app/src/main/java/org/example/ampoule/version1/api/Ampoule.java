package org.example.ampoule.version1.api;

public class Ampoule {
    private EtatAmpoule e;


    public Ampoule() {
        this.e = new EtatEteinte(0);
    }



    public void allumer() throws EtatIllegal {
        this.e = this.e.allumer();
    }

    public void eteindre() throws EtatIllegal {
        this.e = this.e.eteindre();
    }
}
