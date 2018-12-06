package TP03;

public class SerieFolle {

    public static void main(String args[]) {

        int max = 20;
        double u = 0.3333333333333333333333;
        System.out.println("u0 = " + u);
        for (int n = 1; n <= max; n++) {
            u = 7 * u - 2;
            System.out.println("u" + n + " = " + u);
        }
    }
}

