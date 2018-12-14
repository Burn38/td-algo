public class TableauMethodes {
	
	public static void main (String args[]) {
		int[] tab = {-4,5,-2,10}; // Tableau de test
        afficheTab(tab);
        System.out.println(indicePlusPetit(tab));
        
        tab[1] = -10; // On change 1 élément du tableau pour voir si les fonctions marchent bien
        afficheTab(tab);
        System.out.println(indicePlusPetit(tab));
        
	}
    
    public static void afficheTab(int[] t) {
        for (int i=0;i<t.length;i++) {
            System.out.print(t[i] + " "); // Affiche chaque élément avec un espace après 
        }
        System.out.println();
    }
    
    public static int indicePlusPetit(int[] t) {
        int minVal = t[0];
        int minInd = 0;
        
        // Parcours le tableau, si il trouve un nouveau minimum, les variables sont mises à jour
        for (int i=0;i<t.length;i++) {
            if (t[i]<minVal) {
                minVal = t[i];
                minInd = i;
            }
        }
        
        return minInd;
    }
}

