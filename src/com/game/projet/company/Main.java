package com.game.projet.company;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenu dans l' Aventure de Donjon ");
        Scanner sc =new Scanner(System.in);

        Piece[] pieceDugeon = new Piece[5];// tableau contenant les pièces

        // les pièces seront crées dès lancement du jeux

        for(int i=0;i<5;i++){
            pieceDugeon[i]=new Piece();
            pieceDugeon[i].numeroPiec=i+1;
        }



        Heros joueur=intialiseJoueur();


        int i =0;
            String armjoueur;  // le type l'arme que vas introduire le joueur

      // do{


            int nbreAttaque =0;

            System.out.print("Un "+pieceDugeon[i].monstre.NomPersonnage +" se cache derière la porte \n");

            if((pieceDugeon[i].monstre.NomPersonnage.equals("magiciens"))&&(pieceDugeon[i].monstre.etat)){ // le magicien qui attaque

                    joueur.Attaque(pieceDugeon[i].monstre,joueur);// un monstre attaque.

                    System.out.print("Le magicien vous a attaqué, vous avez perdu "+pieceDugeon[i].monstre.NbrPointAttaque+"\n"+
                                    "Vous avez  " +joueur.nbrVie+  " Poits de vie");


                    if(Math.random()<0.1){
                        System.out.println("Le magicienc vous a praliser Vous ne pourrez l'attaquer juqu'au tour prochain");


                    }else{
                        System.out.print("Attention pour attaque vous devez choisir \" eauMagic \" "+"\n"+
                                "Entrer le nom de votre arme ici:.... ");

                         armjoueur= sc.nextLine(); // recupère le nom de l'arme que le joueur vas utiliser

                        if(armjoueur.equals("eauMagic")){   // le joueur attaque le magicien
                            nbreAttaque++;
                            joueur.Attaque(joueur,pieceDugeon[i].monstre);
                            joueur.AttaqueHero(joueur,pieceDugeon[i].monstre,nbreAttaque);

                            System.out.print("Vous avez attaqué le magicien. Il a perdu "+nbreAttaque*joueur.NbrPointAttaque2+"\n"+
                                              "Il lui reste " +pieceDugeon[i].monstre.nbrVie+"poits de vie" );



                        }else{
                            System.out.println("Votre saisie est incorrecte");
                        }
                    }



            }else {

                System.out.println("Un barbar se cache derière la porte");

                System.out.print("Vous ête attaqué par un Barbars.\n"+
                                 "Vous avez perdu "+ ". Il vous reste "+
                                "Attention pour attaque vous devez choisir \" Epee \" "+"\n"+
                                "Entrer le nom de votre arme ici:.... " );

                   armjoueur= sc.nextLine(); // recupère le nom de l'arme que le joueur vas utiliser

                if(armjoueur.equals("Epee")){   // le joueur attaque le barbar
                    joueur.Attaque(joueur,pieceDugeon[i].monstre);
                }else{
                    System.out.println("Vous avez fait une erreur de saisi.");

                }




            }







            i++;



      //  }while(joueur.nbrVie >0 && pieceDugeon[i].numeroPiec<5);//condition d'aarête
                                                                  // si le joueur n'a plus de vie
                                                                  // ou il arrive à la 5 pièce.


    }



    // Fonction initialise le joueur

    public static Heros intialiseJoueur(){

        Heros joueur = new Heros(); // Création du joeurs.
        joueur.nbrVie=200;
        joueur.etat=true;
        joueur.NomPersonnage="joueur";
        joueur.nomArms="eauMagic";
        joueur.NbrPointAttaque=2;
        joueur.nomArms2="Epee";
        joueur.NbrPointAttaque2=3;

        return joueur;
    }


}
