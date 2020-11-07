package com.game.projet.company;

import java.util.Scanner;

public class Piece {

    Monstre monstre;

    public Piece(){

        if(Math.random()<0.5){  //Magicien
            monstre=new Magicien();

        }else {
            monstre=new Barbar();
        }

    }

    public boolean entrePiece(Hero aventurier){
        
        Scanner scanner =new Scanner(System.in);
        boolean etatBarbar=true;
        boolean etatHero=true;
        int nombreCombat =0;

        while (aventurier.estEnVie()&& monstre.estEnVie()){

            nombreCombat++;

                if(monstre.nomMonstre.equals("magicien")) {
                    System.out.println("Vous êtes attaqué par un magicien");

                    monstre.Attaque(aventurier,1);


                    if (Math.random() < 0.1) {


                        System.out.println("Le magiciens vous a paralysé, vous ne pourrez pas attequer au prochaine tour\n ");

                    }else
                        System.out.print("Pour attaquer le magigicient vous devez choisir \"FlaqueEau\" comme arme");

                        if ((scanner.nextLine()).equals("FlaqueEau")) {
                             aventurier.Attaque(monstre,nombreCombat);
                        }

                }else {

                        if(etatBarbar){ // le barbar n'est pas paralysé

                            System.out.println("Vous êtes attaqué par un barbar");

                            if (Math.random() < 0.3) {
                                monstre.Attaque(aventurier,2);
                            }else {
                                monstre.Attaque(aventurier,1);
                            }}

                      System.out.print("Vous devez choisir \"Epee\" pour combattre le barbars");
                        if((scanner.nextLine()).equals("Epee")){
                            aventurier.Attaque(monstre,nombreCombat);
                            if (Math.random()<0.1){
                                etatBarbar=false;
                            }

                        }

                        }



                };

        return aventurier.estEnVie();
        }



    }








