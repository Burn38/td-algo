package TP03;

public class ArtisteAtelier2 {

    public static void main(String args[]) {
        Affichage.tourner(true, 60);
        Affichage.avancer(100);
        Affichage.tourner(true, 30);
        Affichage.avancer(100);
        Affichage.tourner(true, 150);
        Affichage.avancer(100);
        Affichage.tourner(true, 30);
        Affichage.avancer(100);

        /* Affichage final */
        Affichage.afficher();
    }
}

