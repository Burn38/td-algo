package TP04;

import java.util.Arrays;
import java.util.Random;

public class EcartTypeTableau {

    public static void main(String[] args) {
        double[] t = genArr();
        System.out.println(Arrays.toString(t));
        System.out.println("Ecart-Type: " + ecartType(t));
    }

    public static double ecartType(double[] arr) {
        double moy = moyenne(arr);
        double sum = 0;
        for (double anArr : arr)
            sum += Math.pow(anArr - moy, 2);
        return Math.sqrt(sum / arr.length);
    }

    public static double moyenne(double[] arr) {
        double sum = 0;
        for (double i : arr)
            sum += i;
        return sum / arr.length;
    }

    public static double[] genArr() {
        return new Random().doubles(100, 0.0, 100.0).toArray();
    }

}
