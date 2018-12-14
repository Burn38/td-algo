public class ArtisteAtelier4 { 
	
	public static void main(String[] args){
        for(int i=0;i<6;i++) {
            for (int j=0;j<6;j++) {
                Affichage.choixCouleur((int)(Math.random()*10));
                Affichage.avancer(100);
                Affichage.tourner(true, 60);
            }
            
            Affichage.tourner(true, 60);
        }
        
		/* Affichage final */
		Affichage.afficher();
	}
}
