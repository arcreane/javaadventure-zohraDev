package com.game.projet.company;

public class Personnage {

    Arms typeArme;
    int nbrVie;
    String NomPersonnage;
    boolean etat;

    public Personnage(){

    }



    // fonction attaque, qui permet de retirer le nombre de points de vie à celui qui est a.

    public void Attaque(Personnage actionAtaquer, Personnage subiAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.

        subiAttaque.nbrVie=subiAttaque.nbrVie-actionAtaquer.typeArme.NbrPointAttaque;


    }


}
