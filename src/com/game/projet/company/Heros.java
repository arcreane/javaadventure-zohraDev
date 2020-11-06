package com.game.projet.company;

public class Heros extends Personnage {

    String nomArms;
    int NbrPointAttaque;
    String nomArms2="Epee";
    int NbrPointAttaque2;

    public Heros(){


    }





    public void AttaqueHero(Heros actionAtaquer, Personnage subiAttaque,int nbreAttaque ){
        // On soustrait le nombre de points de l'arme de l'aquant du nombre dembre de vie d'attaqué.

         if(subiAttaque.NomPersonnage.equals("magiciens")){ // Heros attaque le magiciens
             int k=subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque2*nbreAttaque;// je teste le nombre de vie restant est positive

             if(k>0){
                 subiAttaque.nbrVie=k;}
             else  {
                 subiAttaque.nbrVie=0;
             }



         }else{// Heros attaque le barbar

            int k =subiAttaque.nbrVie-actionAtaquer.NbrPointAttaque*nbreAttaque;

             if(k>0){
                 subiAttaque.nbrVie=k;}
             else  {
                 subiAttaque.nbrVie=0;
             }
         }



    }

    public void AttaqueBarbare(Personnage actionAtaquer, Personnage subiAttaque,int nbreAttaque) {

    }

}
