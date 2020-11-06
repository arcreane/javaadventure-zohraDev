package com.game.projet.company;

public class Personnage {

    int NbrPointAttaque;
    String nomArms;
    String typeArme;
    int nbrVie;
    String NomPersonnage;
    boolean etat;

    public Personnage(){

    }



    // fonction attaque, qui permet de retirer le nombre de points de vie à celui qui est a.

    public void Attaque(Personnage actionAtaquer, Personnage subiAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.
            int k=subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque;
         if(k!=0){
             subiAttaque.nbrVie=k;}
         else  {
             subiAttaque.nbrVie=0;
         }
    }


}
