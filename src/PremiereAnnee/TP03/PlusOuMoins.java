import java.util.Scanner;

public class PlusOuMoins {

	public static void main(String[] args) {
		int chercheChercheCherche = (int)(Math.random()*1000);
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		while (input != chercheChercheCherche) {
			if (input < chercheChercheCherche) {
				System.out.println("Plus");
			} else {
				System.out.println("Moins");	
			}
			
			
			input = sc.nextInt();
		}
		
		System.out.println("Ok gagné");
	}
}


// 6.2
