public class ArtisteAtelier3 { 
	
	public static void main(String[] args){
		for (int i=0;i<6;i++) {
            Affichage.avancer(100);
            Affichage.tourner(true, 60);
        }
		
		/* Affichage final */
		Affichage.afficher();
	}
}
