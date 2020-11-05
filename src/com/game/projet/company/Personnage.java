package com.game.projet.company;

public class Personnage {

    String nomPersonnage;
    int nombreVie =200;
    Arms typeArme;

    public Personnage(){

    }

    
    // fonction attaque, qui permet de retirer le nombre de points de vie à celui qui est a.
    public void Attaque(Personnage actionAtaquer, Personnage subiAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.
         subiAttaque.nombreVie=subiAttaque.nombreVie-actionAtaquer.typeArme.NombrePoint;

    }

}
