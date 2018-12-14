public class ProportionJumeaux {
	
	public static void main (String args[]) {
        int comptPremiers = 0;
        int comptJumeaux = 0;
        double rapport;
        
        for (int n=1;n<6;n++) {
            comptPremiers = 0;
            comptJumeaux = 0;
            
            for (int i=1;i<Math.pow(10,n);i++) {
                if (EstPremier(i)) {
                    comptPremiers += 1;
                    if (SontJumeaux(i,i-2) || SontJumeaux(i,i+2))
                        comptJumeaux += 1;
                }
            }
            
            rapport = (double)(comptJumeaux)/(double)(comptPremiers);
            
            DrawGraph(rapport);
        
        }
        
        
    }
    
    public static boolean EstDivisible(int n, int p) { // ligne à completer
        if (n%p == 0)
            return true;
        else
            return false;
    }
     
    public static boolean EstPremier(int nb) {
        if (nb==1 || nb==0)
            return false;
    
        boolean premier = true;
        for (int i = 2;i<(int)(Math.sqrt(nb)+1);i++) {
            if (EstDivisible(nb,i)) {
                premier = false;
                break;
            }
        }
        return premier;
    }
    
    public static boolean SontJumeaux(int n1,int n2) {
        if (EstPremier(n1) && EstPremier(n2) && (Math.abs(n1-n2)==2))
            return true;
        else
            return false;
    }
    
    public static void DrawGraph(double rapport) {
        int nbEtoiles = (int)(rapport*20f); // Combien d'étoiles sur 20?
        System.out.print("+––––––––––––––––––––+\n|");
        for (int i=0;i<20;i++) {
            if (i<nbEtoiles)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println("| " + (int)(rapport*100f) + " %\n+––––––––––––––––––––+\n");
    }
}
