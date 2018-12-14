public class Absolue {
	
	public static void main (String args[]) {
        for (int i=-10;i<=10;i++) {
            System.out.println(valAbs(i)); // Affiche 10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10
        }
        
        int q23 = valAbs(25- (int)(Math.sqrt(576))); // |25-sqrt(576)|
        System.out.println(q23);
	}
    
    public static int valAbs (int x) {
        if (x>0)
            return x;
        else
            return -x;
    }
}

