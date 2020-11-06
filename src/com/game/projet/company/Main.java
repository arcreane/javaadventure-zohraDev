package com.game.projet.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenu dans l' Aventure de Donjon ");
        Scanner sc =new Scanner(System.in);
        boolean clesPorte=true;

        Piece[] pieceDugeon = new Piece[5];// tableau contenant les pièces

        // les pièces seront crées dès lancement du jeux

        for(int i=0;i<5;i++){
            pieceDugeon[i]=new Piece();
            pieceDugeon[i].numeroPiece=i+1;
        }



        Heros joueur=intialiseJoueur();


        int i =0;

        String armjoueur;  // le type l'arme que vas introduire le joueur

        while((clesPorte==true)&&(i<5)){
          System.out.println("Vous êtes dans la pièce Numéro :" +pieceDugeon[i].numeroPiece +"\n");

//**********************************************partie Entre Hero et Magicien****************************
            int nbreAttaque =0;



            if(pieceDugeon[i].monstre.NomPersonnage.equals("magiciens")){ // le magicien qui attaque
                System.out.print("Un magicien se cache derière la porte \n");

                while ((joueur.nbrVie>0) &&(pieceDugeon[i].monstre.nbrVie>0)){ // boucle combat hero et magiciens jusqu'à ce que l'un meurt

                    joueur.Attaque(pieceDugeon[i].monstre, joueur);// un magicien attaque.

                    System.out.print("Le magicien vous a attaqué, vous avez perdu  " + pieceDugeon[i].monstre.NbrPointAttaque + "\n" +
                            " Vous avez  " + joueur.nbrVie + " Poits de vie\n");


                    if (Math.random() < 0.1) {
                        System.out.println("Le magicienc vous a praliser Vous ne pourrez l'attaquer juqu'au tour prochain");


                    } else {
                        System.out.print("Attention pour attaque vous devez choisir \" eauMagic \" " + "\n" +
                                "Entrer le nom de votre arme ici:.... ");

                        armjoueur = sc.nextLine(); // recupère le nom de l'arme que le joueur vas utiliser

                        if (armjoueur.equals("eauMagic")) {   // le joueur attaque le magicien
                            nbreAttaque++;
                            joueur.Attaque(joueur, pieceDugeon[i].monstre);
                            joueur.AttaqueHero(joueur, pieceDugeon[i].monstre, nbreAttaque);

                            System.out.print("Vous avez attaqué le magicien. Il a perdu " + nbreAttaque * joueur.NbrPointAttaque2 + "\n" +
                                    "Il lui reste  " + pieceDugeon[i].monstre.nbrVie + " poits de vie\n");


                        } else {
                            System.out.println("Votre saisie est incorrecte");
                        }
                    }

                }
                if(joueur.nbrVie==0){
                    System.out.println("vous avez perdu la partie");
                    clesPorte=false;
                }else if(i<4){
                    System.out.println("vous avez  tué le magicien entrez dans la pièce suivantes");
                    clesPorte=true;

                }

//**********************************************partie Entre Hero et barbars******************************************
            }else {


                System.out.println("Un barbar se cache derière la porte");
                while ((joueur.nbrVie>0) &&(pieceDugeon[i].monstre.nbrVie>0)){

                        if(pieceDugeon[i].monstre.etat!=false){


                            joueur.Attaque(pieceDugeon[i].monstre,joueur);// un barbars attaque.

                            System.out.print("Vous ête attaqué par un Barbars.\n"+
                                    "Vous avez perdu "+pieceDugeon[i].monstre.NbrPointAttaque+"\n"+
                                    "Il vous reste "+joueur.nbrVie+"\n"+
                                    "Attention pour attaque vous devez choisir \" Epee \" "+"\n"+
                                    "Entrer le nom de votre arme ici:.... " );
                        }
                        armjoueur= sc.nextLine();        // recupère le nom de l'arme que le joueur vas utiliser

                        if(armjoueur.equals("Epee")){                                            // le joueur attaque le barbar
                            joueur.AttaqueHero(joueur,pieceDugeon[i].monstre,2);
                            System.out.print("Vous avez attaqué le barbas. Il a perdu  "+ 2*joueur.NbrPointAttaque+"\n"+
                                    " Il lui reste  " +pieceDugeon[i].monstre.nbrVie+" poits de vie\n" );

                            pieceDugeon[i].monstre.etat=true;



                            if(Math.random()<0.1){
                                System.out.print("Vous avez imobilisez le barbar\n"+
                                                "Vous pouvez attaquer une deuxième fois"+
                                                "Attention pour attaque vous devez choisir \" Epee \" "+"\n"+
                                                "Entrer le nom de votre arme ici:.... " );;
                                pieceDugeon[i].monstre.etat=false;
                            }

                        }else{
                            System.out.println("Vous avez fait une erreur de saisi.");
                        }



                }

                  if(joueur.nbrVie==0){
                    System.out.println("vous avez perdu la partie");
                      clesPorte=false;

                 } else if(i<4){
                     System.out.println("vous avez  tué le barbars entrez dans la pièce suivantes");
                    clesPorte=true;

                  }

                }







            i++;



       }//condition d'arret

        if ((clesPorte==true)&&(i==5)){
            System.out.println("Bravo vous avez gagner le trésore");
        }
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
