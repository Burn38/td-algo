public class TestCroissantTableau {
	
	public static void main (String args[]) {
		
		/** Batterie de tests **/
		//int[] tab = {12, 8, 16, 4, 9, 11};
        //int[] tab = {1,-1, 1,2,3,4,5,5};
        //int[] tab = {-1, 1,2,3,4,5,5};
        
        boolean trie = true;
        // On initialise la variable qui dit si le tableau est trié, et si on se rend compte qu'il ne l'est pas, on le passe à faux
        
        for (int i=1;i<tab.length;i++) {
            if (tab[i]<tab[i-1]) { // Si l'élément précédent est plus grand que l'actuel
                trie = false; // Le tableau n'est alors pas trié
                break; // On sort de la boucle
            }
        }
        
        if (trie) {
            System.out.println("Le tableau est tiré");
        } else {
            System.out.println("Le tableau n'est pas trié");
        }
	}
}

