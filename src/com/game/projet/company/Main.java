package com.game.projet.company;

public class Main {

    public static void main(String[] args) {

        Piece[] pieceDugeon = new Piece[5];// tableau contenant les pièces
       Personnage joueur = new Personnage();

        int i =0;
        do{
            pieceDugeon[i]=new Piece();
            pieceDugeon[i].numeroPiec=i;// initialise le numéro de la pièce
            i++;

        }while(joueur.nombreVie >0 && pieceDugeon[i].numeroPiec<5);//condition d'aarête
                                                                  // si le joueur n'a plus de vie
                                                                  // ou il arrive à la 5 pièce.


    }


}
