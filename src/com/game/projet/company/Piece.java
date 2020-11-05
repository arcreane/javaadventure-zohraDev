package com.game.projet.company;

public class Piece {
    Personnage monstre;
    int numeroPiec;

    public Piece(){
        monstre =new Personnage();
        if(Math.random()<0.5){

            monstre.NomPersonnage="magiciens";
            monstre.typeArme.nomArms="eclairs";
            monstre.typeArme.NbrPointAttaque=10;
            monstre.etat=true;
            monstre.nbrVie=20;

        }else{
            monstre.NomPersonnage="barbars";
            monstre.typeArme.nomArms="hache";
            monstre.typeArme.NbrPointAttaque=15;
            monstre.etat=true;
            monstre.nbrVie=20;



        }


    }
}
