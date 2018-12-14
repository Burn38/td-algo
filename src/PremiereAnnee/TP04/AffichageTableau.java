public class AffichageTableau {
	
	public static void main (String[] args) {
		int[] t = {3, 4, 12, 7, 14, 8};
		
		for (int i=0;i<t.length;i++) { // Parcours du tableau
			System.out.print(t[i] + " "); // A chaque itération, affiche l'élément et revient à la ligne
		}
		System.out.print("\n"); // Revient à la ligne
		
		// On modifie 2 éléments
		t[2] = 0; 
		t[4] = 0;
		
		// Affichage du tableau avec la même méthode
		for (int i=0;i<t.length;i++) {
			System.out.print(t[i] + " ");
		}
		System.out.print("\n");
		
		for (int i=0;i<t.length;i++) {
			if (t[i] != 0) { // Affiche uniquement les éléments non nuls
				System.out.print(t[i] + " ");
			}
		}
		System.out.print("\n");
		
		double[] t2 = new double[3]; // Création d'un nouveau tableau
		t2[0] = 1.2;
		t2[1] = 4.3;
		t2[2] = 6.5;
		
		for (int i=0;i<t2.length;i++) {
			System.out.print(t2[i] + " ");
		}
		System.out.print("\n");
	}
}

