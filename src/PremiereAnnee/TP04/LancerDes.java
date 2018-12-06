public class LancerDes {
	
	public static void main (String args[]) {
		int [] tab = new int[100];
        int [] compteur = new int[6];
        
        for (int i=0;i<tab.length;i++) {
            tab[i] = (int)(Math.random()*6)+1;
        }
            
        for (int i=0;i<tab.length;i++) {
            compteur[tab[i]-1] += 1;
        }
        
        
        // 1ere visualisation
        for (int i=0;i<compteur.length;i++) {
            System.out.println((i+1) + ": " + compteur[i]);
        }
        
        // 2eme visualisation
        
        for (int i=0;i<compteur.length;i++) {
            System.out.print("\n" + (i+1) + ": ");
            for (int j=0;j<compteur[i];j++) {
                System.out.print("*");
            }
            
        }
	}
}

