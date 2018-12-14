public class NbOrWhile {

	public static void main(String[] args) {
	double u = 500;
	double phi = 1.618033988749895;
	double E = Math.pow(10,-2);
	int cpt = 1;
	
	while (Math.abs(u-phi)>E) {
		System.out.println("u"+cpt+"="+u);
		u=1+1/u;
		cpt++;
	}
		
	System.out.println("u"+cpt+"="+u);
	System.out.println("Phi="+phi);
	System.out.println("Difference: " + Math.abs(u-phi));
	}
}
