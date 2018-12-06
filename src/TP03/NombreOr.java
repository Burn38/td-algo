package TP03;

public class NombreOr {

    public static void main(String args[]) {

        int n = 2;
        final double golden = (1 + Math.sqrt(5)) / 2;
        double u_ = 1;
        double u = 1 + 1 / u_;
        final int precision = 6;
        //System.out.println("u0 = " + u);

        while (Math.abs(u - u_) / 2 > Math.pow(10, - precision)) {
            u_ = 1 + 1 / u_;
            u = 1 + 1 / u_;
            n++;
        }

        System.out.println("Nombre d'or (precision = 10^" + precision + ") = " + u);
    }
}

