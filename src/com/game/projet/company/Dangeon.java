package com.game.projet.company;

import java.util.Scanner;

public class Dangeon {
            
    Piece[] pieceDangeon = new Piece[5];

            public Dangeon(){

                for (int i=0; i<pieceDangeon.length;i++){

                 pieceDangeon[i]= new Piece();//Création des 5 pièces
            }
            }


    public void entreDangeon(Hero aventurier) {
        int i=0;
        Scanner scanner =new Scanner(System.in);

        while (aventurier.estEnVie()&&(i < 5)){

            System.out.println("Bienvue dans le jeux Aventure & Dangeon\n\n");
            System.out.println("Vous rentrez dans le pièce N°"+ (i+1) );
            System.out.println(pieceDangeon[i].monstre.nomMonstre+" se cache derière la porte");
            pieceDangeon[i].entrePiece(aventurier);



                    i++;

        }
        if (aventurier.estEnVie()){
             System.out.println("Bravo, vous avez reccuperé le trésor");
        }
                
    }
}
