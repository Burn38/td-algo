/** Artiste
* @author Vincent CHEUTET
*/

public class ArtisteAtelier1 { 
	
	public static void main(String[] args){
		// Première instruction
        for (int i=0;i<4;i++) {
            Affichage.avancer(100);
            Affichage.tourner(true, 90);
        }
		
		/* Affichage final */
		Affichage.afficher();
	}
}
