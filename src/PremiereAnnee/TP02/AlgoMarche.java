package PremiereAnnee.TP02;

/**
 * Ce programme illustre le TD1 et permet de calculer la somme dépensée ainsi que le poids du le panier.
 *
 * @author Bruno Mascret modif by Vincent CHEUTET Regardez mon dessin : https://studio.code.org/c/694858323
 */

public class AlgoMarche {

    public static void main(String[] args) {

        /* Les poids sont en grammes */
        /* les prix en centimes d'euro */

        /* Déclaration et initialisation des variables d'entrée du problème */
        int prixKgTomates = 350;
        int prixKgTomme = 2500;
        int prixKgComte = 1100;
        int prixYaourt = 75;
        int prixBaguette = 80;
        int prixKgPommeDeTerre = 200;
        int prixCafe = 110;

        boolean promoTomme = false;
        boolean fromage = false;

        /* Déclaration et initialisation des variables de sortie et internes */
        double somme = 2 * 2000 + 1000 + 2 * 200; //la somme qu'il y a dans mon porte monnaie
        double depense = 0;
        double poidsPanier = 0; // Le poids du panier à un instant t.

        /* début du programme */
        System.out.println("Je suis sur le marché...");
        System.out.println("*** Mon panier pèse " + poidsPanier + "g et il me reste " + somme + "c d'euro");

        /* tomates */
        if (prixKgTomates < 200) {
            System.out.println("J'achète 3 Kg de tomates à " + prixKgTomates + "c le Kg");
            double prix = 3 * prixKgTomates;
            somme -= prix;
            depense += prix;
            poidsPanier = poidsPanier + 3000;
        } else {
            System.out.println("J'achète 3Kg de pommes de terre à " + prixKgPommeDeTerre + "c le Kg");
            double prix = 3 * prixKgPommeDeTerre;
            somme -= prix;
            depense += prix;
        }

        if (promoTomme) {
            System.out.println("J'achète 500g de tomme de savoie à " + prixKgTomme + "c le Kg");
            double prix = 0.5 * prixKgTomme;
            somme -= prix;
            depense += prix;
            fromage = true;
        } else if (prixKgComte <= 1200) {
            System.out.println("J'achète 250g de comté à " + prixKgComte + "c le Kg");
            double prix = 0.25 * prixKgComte;
            somme -= prix;
            depense += prix;
            fromage = true;
        } else {
            System.out.println("J'achète 3 yaourts à " + prixYaourt + "c l'unité");
            double prix = 3 * prixYaourt;
            somme -= prix;
            depense += prix;
        }

        if (! fromage || somme > 1000) {
            System.out.println("J'achète 1 paquet de café à " + prixCafe + "c l'unité");
            double prix = 1 * prixCafe;
            somme -= prix;
            depense += prix;
        }
        if (fromage) {
            System.out.println("J'achète 1 baguette à " + prixBaguette + "c l'unité");
            double prix = 1 * prixBaguette;
            somme -= prix;
            depense += prix;
        }

        System.out.println("*** J'ai terminé mon marché");
        System.out.println("*** Mon panier pèse " + poidsPanier + "g et il me reste " + somme + "c d'euro. J'ai dépensé " + depense + "c");
    }
}
