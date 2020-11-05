package com.game.projet.company;

public class Main {

    public static void main(String[] args) {

        Piece[] pieceDugeon = new Piece[5];// tableau contenant les pièces

        for(int i=0; i<pieceDugeon.length; i++){
            pieceDugeon[i]=new Piece();
            pieceDugeon[i].numeroPiec=i;// initialise le numéro de la pièce 

        }


    }


}
s