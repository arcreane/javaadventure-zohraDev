package com.game.projet.company;

public class Piece {
    Personnage monstre;
    int numeroPiece;

    public Piece(){
        monstre =new Personnage();

        if(Math.random()<0.5){

            monstre.NomPersonnage="magiciens";
            monstre.nomArms="eclairs";
            monstre.NbrPointAttaque=10;
            monstre.etat=true;
            monstre.nbrVie=20;

        }else{
            monstre.NomPersonnage="barbars";
            monstre.nomArms="hache";
            monstre.NbrPointAttaque=15;
            monstre.etat=true;
            monstre.nbrVie=20;



        }


    }
}
