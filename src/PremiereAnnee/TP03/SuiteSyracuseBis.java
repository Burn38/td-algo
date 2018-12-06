package PremiereAnnee.TP03;

public class SuiteSyracuseBis {

    public static void main(String args[]) {

        int n = 1;
        long u = 500;
        System.out.println("u0 = " + u);

        while (u != 1) {
            if (u % 2 == 0) {
                u = u / 2;
            } else {
                u = 3 * u + 1;
            }
            System.out.println("u" + n + " = " + u);
            n++;
        }
        System.out.println("u = 1 at rank " + (n - 1));
    }
}

