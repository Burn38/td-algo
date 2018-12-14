import java.util.Scanner;

public class ImpotCalc {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		int revenus = sc.nextInt();
        int parts = sc.nextInt();
        
        double rapport = revenus/parts;
        double coeff1;
        int coeff2;
        
        if (rapport >= 0 && rapport <= 20000) {
            coeff1 = 0.125;
            coeff2 = 50;
        } else {
            if (rapport <= 30000) {
                coeff1 = 0.25;
                coeff2 = 100;
            } else {
                coeff1 = 0.5;
                coeff2 = 200;
            }
        }
        
        int impot = (int) (revenus*coeff1-coeff2*parts);
        
        System.out.println(impot);
	}
}
