/** Ce programme illustre le TD1 et permet de calculer la somme dépensée ainsi que le poids du le panier.
* @author Bruno Mascret
* modif by Vincent CHEUTET
*/

public class AlgoMarche {
	public static void main(String[] args) {
		/* Les poids sont en grammes */
		/* les prix en centimes d'euro */

		/* Déclaration et initialisation des variables d'entrée du problème */
		int prixKgTomates = 150;
        int prixKgTomme = 1000;
        boolean promoTomme = false;
        int prixKgConte = 1100;
        int prixUnitYaourt = 50;
        int prixUnitPain = 80;
        int prixkgPdT = 200;
        int prixPaquetCafe = 110;
        boolean acheteFromage = false;
        

		/* Déclaration et initialisation des variables de sortie et internes */
		double somme = 2*2000 + 1000 + 2*200; //la somme qu'il y a dans mon porte monnaie
        final double SOMME_INIT = somme;
		double poidsPanier = 0; // Le poids du panier à un instant t.

		/* début du programme */
		System.out.println("Je suis sur le marché...");
		System.out.println("*** Mon panier pèse " + poidsPanier +"g et il me reste " + somme + "c d'euro");
        
		/* tomates */
		if(prixKgTomates<200) {
            System.out.println("J'achète 3 Kg de tomates à " + prixKgTomates + "c le Kg");
            somme = somme - 3 * prixKgTomates;
            poidsPanier = poidsPanier + 3000;
		} else {
            System.out.println("J'achète 3 Kg de pommes de terre à " + prixkgPdT + "c le Kg");
            somme = somme - 3 * prixkgPdT;
            poidsPanier = poidsPanier + 3000;
        }
		
        if (promoTomme) {
            System.out.println("J'achète 500g de tomme à " + prixKgTomme + "c le Kg");
            somme = somme - 0.5 * prixKgTomme;
            poidsPanier = poidsPanier + 500;
            acheteFromage = true;
        } else {
            if (prixKgConte<1200) {
                System.out.println("J'achète 250g de conté à " + prixKgConte + "c le Kg");
                somme = somme - 0.25 * prixKgConte;
                poidsPanier = poidsPanier + 250;
                acheteFromage = true;
            } else {
                System.out.println("J'achète 3 yaourts à " + prixUnitYaourt + "c l'unité");
                somme = somme - 3 * prixUnitYaourt;
                poidsPanier = poidsPanier + 3*125;
            }
        }
        if (acheteFromage) {
            System.out.println("J'achète une baguette à " + prixUnitPain + "c l'unité");
            somme = somme - prixUnitPain;
            poidsPanier = poidsPanier + 200;
        }
        if (!acheteFromage || somme>=10000) {
            System.out.println("J'achète 1 paquet de café à " + prixPaquetCafe + "c l'unité");
            somme = somme - prixPaquetCafe;
            poidsPanier = poidsPanier + 100;
        }
		System.out.println("*** J'ai terminé mon marché");
		System.out.println("*** Mon panier pèse " + poidsPanier +"g et il me reste " + somme + "c d'euro");
        
        double depense = SOMME_INIT-somme;
        System.out.println("*** J'ai dépensé " + depense + "c au marché aujourd'hui");
	}
}

/* 4-1
 * Pour le moment, la classe initialise la somme d'argent restante et le poids du panier
 * Le programme teste si le prix au kg des tomates est inférieur à 200e, et si c'est le cas,
 * j'en achète 3kg
 * Pour terminer, le programme affiche la somme d'argent restante finale et le poids du panier.
 */
 
 /* 4-2
  * Si je change le prix des tomates pour être inférieur à la limite fixée, j'en achète 3kg et mon panier
  * n'est plus vide à la fin;
  */
