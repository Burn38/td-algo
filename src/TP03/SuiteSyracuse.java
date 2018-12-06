package TP03;

public class SuiteSyracuse {

    public static void main(String args[]) {

        int max = 500;
        long u = 500;
        System.out.println("u0 = " + u);

        for (int n = 1; n <= max; n++) {
            if (u % 2 == 0) {
                u = u / 2;
            } else {
                u = 3 * u + 1;
            }
            System.out.println("u" + n + " = " + u);
        }
    }
}

