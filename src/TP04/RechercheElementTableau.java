package TP04;

import java.util.Scanner;

public class RechercheElementTableau {

    public static void main(String[] args) {

        int[] t = {3, 12, 20, 15, 18, 16, 14, 18, 13};

        Scanner sc = new Scanner(System.in);
        //affichage pour l'utilisateur
        System.out.println("De quel entier cherchez-vous la position ?");
        //obtention de la valeur saisie au clavier
        int valeurCherchee = sc.nextInt();

        System.out.println("Vous cherchez la valeur : " + valeurCherchee);

        int pos = -1;
        for (int i = 0; i < t.length; i++)
            if (t[i] == valeurCherchee)
                pos = i;

        System.out.println(pos);
        // jeu de tests
        //ecrire ici les valeurs a tester et pourquoi
    }

}
