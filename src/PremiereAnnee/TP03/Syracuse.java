public class Syracuse {

	public static void main(String[] args) {
	int u = 500;
	final int n = 200;
	
		for (int i=1;i<=n;i++) {
			System.out.println("u"+i+"="+u);
			
			if (u%2 == 1) {
					u=3*u+1;
			} else {
					u /= 2;
			}
		}
	}
}
