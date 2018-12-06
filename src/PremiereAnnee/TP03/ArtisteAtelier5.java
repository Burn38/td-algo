package PremiereAnnee.TP03;

/**
 * Artiste
 *
 * @author Guillaume LAVOUE$
 * @author Guillaume ANTHOUARD
 */

public class ArtisteAtelier5 {

    public static void main(String[] args) {

        int longeur = 10;
        int angle = 10;
        int tourBoucle = 36;

        for (int i = 0; i < tourBoucle; i++) {
            Affichage.avancer(longeur);
            Affichage.tourner(true, angle);
            Affichage.saut(5);
        }

        /* Affichage final */
        Affichage.afficher();
    }
}
