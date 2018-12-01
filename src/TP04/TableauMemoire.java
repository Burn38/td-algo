package TP04;

public class TableauMemoire {

    public static void main(String[] args) {
        Integer[] t1 = {1, 8};
        Integer[] t2 = t1;

        AffichageTableau.afficher(t1);
        AffichageTableau.afficher(t2);

        t2[1] = 0;

        AffichageTableau.afficher(t1);
        AffichageTableau.afficher(t2);
    }
}
