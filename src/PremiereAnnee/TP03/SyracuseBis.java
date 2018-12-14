public class SyracuseBis {

	public static void main(String[] args) {
	int u = 500;
	int n = 1;
	
	while (u!=1) {
			System.out.println("u"+n+"="+u);
			
			if (u%2 == 1) {
					u=3*u+1;
			} else {
					u /= 2;
			}
			
			n++;
		}
		
	System.out.println("u"+n+"="+u);
	
	}
}

