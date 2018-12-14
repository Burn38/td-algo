public class EcartTypeTableau {
	
	public static void main (String args[]) {
		 double[] t = {3.2, 5.1, 12.5, 7.5, 8.8, 4.9};
         
         int len = t.length;
         
         // On additionne tous les nombres du tableau
         double somme = 0f;
		for (int i=0;i<len;i++) {
           somme+=t[i];
        }
        
        // On divise la somme par le nomber d'éléments pour obtenir la moyenne
        double moyenne = somme/len;
        
        // On calcule la somme quadratique de la différence entre chaque nombre du tableau et la moyenne
        double sommeQuadr = 0f;
        for (int i=0;i<len;i++) {
            sommeQuadr+= Math.pow((t[i]-moyenne),2);
        }
        
        // On calcule enfin l'écart-type
        double ecartType = Math.sqrt(sommeQuadr/len);
        System.out.println(ecartType);
	}
}

