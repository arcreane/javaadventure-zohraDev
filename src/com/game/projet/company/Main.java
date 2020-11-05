package com.game.projet.company;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Piece[] pieceDugeon = new Piece[5];// tableau contenant les pièces

        Personnage joueur = new Personnage(); // Création du joeurs.
        System.out.print("Entrer le nom que vous voulez donner à votre joueur ici:.. :");
        joueur.nomPersonnage=sc.nextLine();


        int i =0;


        do{
            // Le combat d'une pièce :
            
            String armjoueur;
            pieceDugeon[i]=new Piece();
            pieceDugeon[i].numeroPiec=i;// initialise le numéro de la pièce

            joueur.Attaque(pieceDugeon[i].monstre,joueur);// un monstre attaque.

            if(pieceDugeon[i].monstre.nomPersonnage.contentEquals("magiciens")){ // le magicien qui attaque



                System.out.print("Vous ête attaqué par un Barbars.\n" +
                        "Attention pour attaque vous devez choisir \" eauMagic \" "+"\n"+
                        "Entrer le nom de votre arme ici:.... " );

                armjoueur= sc.nextLine(); // recupère le nom de l'arme que le joueur vas utiliser

                if(joueur.typeArme.getNomArm().equals("eauMagic")){   // le joueur attaque le magicien
                    joueur.Attaque(joueur,pieceDugeon[i].monstre);
                }
            }else {

                System.out.print("Vous ête attaqué par un Barbars.\n" +
                                 "Attention pour attaque vous devez choisir \" Epee \" "+"\n"+
                                 "Entrer le nom de votre arme ici:.... " );

                armjoueur= sc.nextLine(); // recupère le nom de l'arme que le joueur vas utiliser

                if(joueur.typeArme.getNomArm().equals("Epee")){   // le joueur attaque le barbar
                    joueur.Attaque(joueur,pieceDugeon[i].monstre);
                }



            }







            i++;



        }while(joueur.nombreVie >0 && pieceDugeon[i].numeroPiec<5);//condition d'aarête
                                                                  // si le joueur n'a plus de vie
                                                                  // ou il arrive à la 5 pièce.


    }


}
