public class Jumeaux {
	
	public static void main (String args[]) {
		/*int[] p = {1,3,6,5,11};
        int [] q = {3,5,8,11,13};
        
        for (int i=0;i<p.length;i++) {
            if (SontJumeaux(p[i], q[i]))
                System.out.println(p[i] + " et " + q[i] + " sont Jumeaux.");
            else
                System.out.println(p[i] + " et " + q[i] + " ne sont pas Jumeaux.");
        }*/
        
        
        /*System.out.println(estDivisible(15,5));
        System.out.println(estDivisible(15,4));
        System.out.println(estDivisible(15,3));
        System.out.println(estDivisible(15,2));*/
        
        /*for (int i=1;i<100;i++) {
            if (EstPremier(i))
                System.out.println(i);
        }*/
    
        int n = 3;
        int comptPremiers = 0;
        int comptJumeaux = 0;
        
        for (int i=1;i<Math.pow(10,n);i++) {
            if (EstPremier(i)) {
                comptPremiers += 1;
                if (SontJumeaux(i,i-2) || SontJumeaux(i,i+2))
                    comptJumeaux += 1;
            }
        }
        int rapport = (int)((double)(comptJumeaux)/(double)(comptPremiers)*100f);
        System.out.println(rapport);
        
        
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
        for (int i = 2;i<(int)(Math.sqrt(nb)+1);i++) { // On regarde si chaque nombre jusqu'à sa racine le divise. Si aucun ne le divise, il est premier
            if (EstDivisible(nb,i)) {
                premier = false;
                break;
            }
        }
        return premier;
    }
    
    public static boolean SontJumeaux(int n1,int n2) {
        if (EstPremier(n1) && EstPremier(n2) && (Math.abs(n1-n2)==2)) // Si les deux nombres sont premiers et leur différence vaut 2
            return true;
        else
            return false;
    }
}
