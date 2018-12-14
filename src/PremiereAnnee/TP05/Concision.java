public class Concision {
	
	public static void main (String args[]) {
        int n = 21;
        
        if (EstPair(n)) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }
        
        System.out.println(estDivisible(15,5));
        System.out.println(estDivisible(15,4));
        System.out.println(estDivisible(15,3));
        System.out.println(estDivisible(15,2));
	}
    
    public static boolean EstPair (int x) {
        return (x%2==0);
    }
    
    public static boolean estDivisible(int n, int p) { // ligne à completer
        return (n%p==0);
    }
}

