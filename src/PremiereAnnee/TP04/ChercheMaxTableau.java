package PremiereAnnee.TP04;

public class ChercheMaxTableau {

    public static void main(String[] args) {

        //le maximum se trouve dans une case quelconque
        //resultat attendu 12.5 - position : 2
        double[] t = {3.2, 5.1, 12.5, 7.5, 8.8, 4.9};

        //le tableau comporte 1 seul element
        //resultat attendu 1.3 - position : 0
        double[] t1 = {1.3};

        //le max est le 1er element
        //resultat attendu 14.4 - position : 0
        double[] t2 = {14.4, 5.1, 12.5, 7.5, 8.8, 4.9};

        //le max est le dernier element
        //resultat attendu 14.9 - position : 5
        double[] t3 = {3.2, 5.1, 12.5, 7.5, 8.8, 14.9};

        //temperatures moyennes a Lyon-Bron en 2016
        //d'apres www.infoclimat.fr
        //resultat attendu 22.6 - position : 6
        double[] temperatures = {6.9, 7.0, 7.6, 12.1, 15.2, 20.0, 22.6, 22.6, 20.4, 12.0, 8.5, 3.0};

        //recherche de l'element de valeur maximum
        // Affiche la première valeur maximum
        printMax(t);
        printMax(t1);
        printMax(t2);
        printMax(t3);
        printMax(temperatures);
    }

    public static void printMax(double[] arr) {
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[pos]) {
                pos = i;
            }
        }

        System.out.println("[" + pos + "] = " + arr[pos]);
    }

}
