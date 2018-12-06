package PremiereAnnee.TP04;

public class ADebugger {

    // Calcule le minimum sur un tableau
    public static void main(String[] args) {

        int[] tab = {12, 8, 16, 4, 9, 11};

        int min = tab[0];
        int pos = 0;

        for (int i = 1; i < tab.length; i++)
        {
            if (tab[i] < min) {
                min = tab[i];
                pos = i;
            }
        }

        System.out.println("Le minimum est " + min + " et se trouve en position " + pos);

    }

}
