package com.game.projet.company;

public class Monstre{

    protected String nomMonstre;
    protected int pointsVie;
    protected Arme armePersonnage;

    public Monstre(){


    }



    public boolean estEnVie(){// fonction qui nous permet
        return this.pointsVie>0;
    }

    public boolean Attaque(Hero aventurier, int nbrecombat ){

          return aventurier.dommageAffliger(armePersonnage.getNbrPointsAttaque(),nbrecombat); // les dommage causé par le monstre à l'aventurier
                                                                                   // retune false si l'aventurier est mort sinon true

    }
    // les dommage subit le mosntre


    public boolean dommageAffliger(int nbreDommage,int k) {
        pointsVie -= nbreDommage*k;
      if (pointsVie <= 0) {
            System.out.println("Le monstre est mort");
       }  else {
            System.out.println("Vous avez perdu  " + nbreDommage*k + "points de vie . Ile vous reste " + pointsVie+" points de vie");
       }
        return estEnVie();
    }




}
