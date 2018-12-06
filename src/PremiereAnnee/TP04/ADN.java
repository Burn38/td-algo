package PremiereAnnee.TP04;

import java.util.Random;

public class ADN {

    // adénine (A), cytosine (C), guanine (G), thymine (T)
    static char[] chars = "ACGT".toCharArray();
    static int brinSize = 20;

    public static void main(String[] args) {
        char[] brin1 = genBrin(brinSize);
        char[] brin2 = genBrin(brinSize);

        System.out.println("Brin1          : " + new String(brin1));
        System.out.println("Brin2          : " + new String(brin2));

        mutate(brin1);

        System.out.println("Brin1 (mutated): " + new String(brin1));

        char[] brin3 = combinate(brin1, brin2);

        System.out.println("Brin3          : " + new String(brin3));
    }

    public static char[] genBrin(int size) {

        char[] brin = new char[size];
        Random rng = new Random();

        for (int i = 0; i < size; i++) {
            brin[i] = chars[rng.nextInt(4)];
        }

        return brin;
    }

    public static void mutate(char[] brin) {
        Random rng = new Random();
        brin[rng.nextInt(brin.length)] = chars[rng.nextInt(4)];
    }

    public static char[] combinate(char[] brin1, char[] brin2) {

        int pos = new Random().nextInt(brin1.length - 1);
        char[] newBrin = new char[brin1.length];

        for (int i = 0; i < brin1.length; i++) {
            if (i <= pos)
                newBrin[i] = brin1[i];
            if (i > pos)
                newBrin[i] = brin2[i];
        }

        return newBrin;
    }

}
