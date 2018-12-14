public class LancerDes {
	
	public static void main (String args[]) {
		int [] tab = new int[100]; // Tableau de 100 éléments qui contiendra les 100 jetés de dé
        int [] compteur = new int[6]; // Tableau qui compte le nombre de fois que chaque face est tirée
        
        // On remplit le premier tableau avec des entiers aléatoires entre 1 et 6
        for (int i=0;i<tab.length;i++) {
            tab[i] = (int)(Math.random()*6)+1;
        }
         
         
        // On passe en revue le tableau pour compter combien de fois chaque face a été tirée   
        for (int i=0;i<tab.length;i++) {
            compteur[tab[i]-1] += 1;
        }
        
        
        // 1ere visualisation
        for (int i=0;i<compteur.length;i++) {
            System.out.println((i+1) + ": " + compteur[i]);
        }
        
        // 2eme visualisation
        for (int i=0;i<compteur.length;i++) {
            System.out.print("\n" + (i+1) + ": "); // Pour chaque face possible
            for (int j=0;j<compteur[i];j++) { 
                System.out.print("*"); // On affiche le nombre d'étoiles correspondant
            }
            
        }
	}
}

