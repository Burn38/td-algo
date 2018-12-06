package PremiereAnnee.TP03;

public class ArtisteAtelier4 {

    public static void main(String args[]) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Affichage.choixCouleur();
                Affichage.avancer(50);
                Affichage.tourner(true, 60);
            }
            Affichage.tourner(true, 60);
        }

        Affichage.afficher();
    }
}

