public class NombreParfait {
	
	public static void main (String args[]) {
		int nb = 28;
        System.out.println(parfait(nb));
        
        /*System.out.println(estDivisible(15,5));
        System.out.println(estDivisible(15,4));
        System.out.println(estDivisible(15,3));
        System.out.println(estDivisible(15,2));*/
        
        System.out.println(parfait(6));
        System.out.println(parfait(28));
        System.out.println(parfait(496));
        System.out.println(parfait(27));
        System.out.println(parfait(4567));
	}
    
    /** Methode divise
      * @param n Entier positif
      * @param p Entier positif
      * @return true si n divisible par p et false sinon
      */
    public static boolean estDivisible(int n, int p) { // ligne à completer
        if (n%p == 0)
            return true;
        else
            return false;
    }
      
    /** Methode parfait
      * @param n Entier positif a tester
      * @return true si n est parfait et false sinon
      */
    public static boolean parfait(int n) { // ligne à completer
        int sommeDivis = 0;
        
        for (int i=1;i<n;i++) {
            if (estDivisible(n,i))
                sommeDivis+= i;
        }
        
        if (n==sommeDivis)
            return true;
        else
            return false;
    }
}
