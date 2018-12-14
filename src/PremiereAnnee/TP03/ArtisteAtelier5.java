public class ArtisteAtelier5 { 
	
	public static void main(String[] args){
		
		int longeur=1;
        int angle=5;
		int tourBoucle=200;
		
		for(int i=0;i<tourBoucle;i++) {
			Affichage.avancer(longeur+i/10);
			Affichage.tourner(true,angle);
		}
		
		/* Affichage final */
		Affichage.afficher();
	}
}
