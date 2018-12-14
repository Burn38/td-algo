public class NbOr {

	public static void main(String[] args) {
	double u = 500;
	final int n = 200;
	
		for (int i=1;i<=n;i++) {
			System.out.println("u"+i+"="+u);
			
			u = 1+ 1/u;
		}
		
	System.out.println("u"+n+"="+u);
	}
}
