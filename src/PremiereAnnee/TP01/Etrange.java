package PremiereAnnee.TP01;

public class Etrange {

    public static void main(String[] args) {

        int i = 2000000;
        int j = 12000;
        int k = i * j;
        System.out.println("Le produit de " + i + " et " + j + " vaut :" + k); //OK

        byte l = 125;
        System.out.println("Ici l vaut " + l);
        l += 10; // equivalent à l'instruction l = l+10;
        System.out.println("et en y ajoutant 10 cela vaut : " + l); // byte n'est pas assez large pour contenir 135, --> -121


        short a = 32767;
        System.out.println("L'entier a vaut :" + a);
        a += 2; // équivalent à l'instruction a = a+10;
        System.out.println("Après ajout de 2, l'entier a vaut :" + a); // Short n'est pas assez large
    }
}
