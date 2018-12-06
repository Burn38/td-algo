package PremiereAnnee.TP03;

public class ArtisteAtelier3 {

    public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {
            Affichage.avancer(50);
            Affichage.tourner(true, 60);
        }

        Affichage.afficher();
    }
}

