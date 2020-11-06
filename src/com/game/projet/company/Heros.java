package com.game.projet.company;

public class Heros extends Personnage {
    String nomArms2;
    int NbrPointAttaque2;






    public void AttaqueHero(Heros actionAtaquer, Personnage subiAttaque,int nbreAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.

         if(subiAttaque.NomPersonnage.equals("magiciens")){

             subiAttaque.nbrVie=subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque2*nbreAttaque;  // Heros attaque le magiciens
         }else{
             subiAttaque.nbrVie=subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque*nbreAttaque;   // Heros attaque le barbas
         }



    }

    /*public void AttaqueBarbare(Personnage actionAtaquer, Personnage subiAttaque,int nbreAttaque){


    }*/

}
