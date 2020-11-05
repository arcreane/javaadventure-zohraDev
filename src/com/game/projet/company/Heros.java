package com.game.projet.company;

public class Heros extends Personnage {
    String nomArms2;
    int NbrPointAttaque2;






    public void AttaqueHero(Personnage actionAtaquer, Personnage subiAttaque,int nbreAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.


         subiAttaque.nbrVie=subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque*nbreAttaque;


    }

    /*public void AttaqueBarbare(Personnage actionAtaquer, Personnage subiAttaque,int nbreAttaque){


    }*/

}
