public class PairImpair {
	
	public static void main (String args[]) {
		int n = 21;
        
        if (EstPair(n)) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
	}
    
    public static boolean EstPair (int x) {
        if (x%2==0) { // Si le reste de la division euclidienne par 2 est nul, c'est un multiple de 2
            return true;
        } else {
            return false;
        }
    }
}

