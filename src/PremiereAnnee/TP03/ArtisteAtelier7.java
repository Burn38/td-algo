public class ArtisteAtelier7 { 
	
	public static void main(String[] args){
        Affichage.choixCouleur(7);
        
        int avanceIni= 50;
        int angleIni = 170;
        
        Affichage.tourner(false,90);
        for (int i=0;i<50;i++) {
            Affichage.avancer(avanceIni-i);
            Affichage.tourner((i%2==0),angleIni-i);
        }
        
        Affichage.afficher();
	}
}
