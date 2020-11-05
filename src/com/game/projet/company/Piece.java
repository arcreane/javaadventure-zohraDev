package com.game.projet.company;

import java.util.Random;

public class Piece {

    int numeroPiec;
    Personnage monstre;



        public Piece(){

            if(Math.random()<0.5){
                monstre.nomPersonnage="magiciens";
                monstre.typeArme.setNomArm("Eclaire");
                monstre.typeArme.NombrePoint=15;

            }else {
                monstre.nomPersonnage="barbars";
                monstre.typeArme.setNomArm("hache");
                monstre.typeArme.NombrePoint=10;

            }
        }



}
