package TP02;

import java.util.Scanner;

public class SaisieClavier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // doit apparaitre (une seule fois) avant l'utilisation de "sc.nextLine()", "sc.nextInt()", etc... (voir plus bas)

        // Saisie d'une chaine de caractere
        System.out.println("Entrer une chaine de caractere svp : ");
        String s = sc.nextLine();
        System.out.println("Merci d'avoir saisir le caractere " + s);

        // Saisie d'un entier
        System.out.println("Entrer un nombre entier svp : ");
        int i = sc.nextInt();
        System.out.println("Merci d'avoir saisir l'entier " + i);

        // Saisie d'un reel
        System.out.println("Entrer un nombre reel svp : ");
        double r = sc.nextDouble();
        System.out.println("Merci d'avoir saisir le reel " + r);
    }
}
