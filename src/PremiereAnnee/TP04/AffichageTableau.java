package PremiereAnnee.TP04;

import java.util.function.Predicate;

public class AffichageTableau {

    public static void main(String[] args) {
        Integer[] t = {3, 4, 12, 7, 14, 8};
        afficher(t);

        t[2] = 0;
        t[4] = 0;

        afficher(t);

        afficherCond(t, i -> i != 0);

        Double[] t2 = new Double[] {1.2, 4.3, 6.5};

        afficher(t2);
    }

    public static <T> void afficher(T[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static <T> void afficherCond(T[] arr, Predicate<T> cond) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (cond.test(arr[i]))
                System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

}
