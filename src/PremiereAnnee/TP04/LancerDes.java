public class LancerDes {

	public static void main (String args[]) {
		
		int [] tab = new int[100]; // Nouveau tableau de taille 100 qui va contenir l'échantillon
		int [] compteur = new int[6]; // Tableau de taille 6 qui va compter l'occurence de chaque issue de l'expérience
		
		// Remplissage du tableau avec des valeurs aléatoires entre 1 et 6
		for (int i=0;i<tab.length;i++) {
		    tab[i] = (int)(Math.random()*6)+1; // Entre 0 et 5, on ajoute 1 pour avoir des valeurs entre 1 et 6
		}

		// On compte le nombre de fois que le dé est tombé sur chaque face
		for (int i=0;i<tab.length;i++) {
		    compteur[tab[i]-1] += 1;
		}


		// 1ere visualisation
		for (int i=0;i<compteur.length;i++) {
		    System.out.println((i+1) + ": " + compteur[i]);
		}

		// 2eme visualisation
		for (int i=0;i<compteur.length;i++) {
		    System.out.print("\n" + (i+1) + ": ");
		// Le nombre d'étoile correspond au nombre de fois que la face a été tirée
		    for (int j=0;j<compteur[i];j++) {
			System.out.print("*");
		    }

		}
	}
}

