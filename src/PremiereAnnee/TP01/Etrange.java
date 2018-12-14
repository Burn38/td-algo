public class Etrange {
    public static void main(String[] args) {
        int i = 2000000;
        int j = 12000;
        int k = i*j;
        System.out.println("Le produit de "+i+ " et "+j+" vaut :"+k);

        byte l=125;
        System.out.println("Ici l vaut "+l);
        l += 10; // equivalent à l'instruction l = l+10;
        System.out.println("et en y ajoutant 10 cela vaut : "+l);
        // On pense que l vaut 135, mais le résultat est 121
        // Entier 8 bits signé, donc overflow quand on va à plus de 2**7-1


        short a=32767;
        System.out.println("L'entier a vaut :"+a);
        a += 2; // équivalent à l'instruction a = a+2;
        System.out.println("Après ajout de 2, l'entier a vaut :"+a);
        // On -32768 au lieu des 37768 attendus
        // Entier 16 bits signé, donc max de 2**15-1: il y a overflow si on passe au dessus
    }
}
