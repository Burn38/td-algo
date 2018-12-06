package PremiereAnnee.TP02;

import java.util.Scanner;

public class Impot {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double impot = 0.0;
        int revenu = sc.nextInt();
        int n = sc.nextInt();

        double temp = revenu / n;
        if (temp >= 0 && temp < 20000) {
            impot = 0.125 * revenu - 50 * n;
        } else if (temp >= 20000 && temp < 30000) {
            impot = 0.25 * revenu - 100 * n;
        } else if (temp >= 30000) {
            impot = 0.5 * revenu - 200 * n;
        }
        System.out.println(impot);
    }
}

