public class NbOrNoPhi {

	public static void main(String[] args) {
	double u = 500;
	double uOld = 0;
	double E = Math.pow(10,-6);
	int cpt = 1;
	
	while (Math.abs(u-uOld)>E) {
		System.out.println("u"+cpt+"="+u);
		uOld = u;
		u=1+1/u;
		cpt++;
	}
		
	System.out.println("u"+cpt+"="+u);
	double phi = 1.618033988749895;
	System.out.println("Difference: " + Math.abs(u-phi));
	}
}
