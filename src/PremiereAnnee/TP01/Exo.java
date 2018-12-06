package PremiereAnnee.TP01;

public class Exo {

    public static void main(String[] args) {

        int x;
        x = 1000 + (1 + 2) * 100 + (2 + 1) * 10 + 1;
        System.out.println("Le résultat est " + x + ". Bravo !");
        char c = 'W';
        System.out.printf("Le caractère %c est la valeur de la variable c%n", c);
        char z = 'b';
        boolean b = c < z;
        System.out.println(b);

        if (z <= 122 && z >= 97) {
            b = true;
        } else {
            b = false;
        }

        System.out.println(b);
    }
}

