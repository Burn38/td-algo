import java.util.Scanner;

public class SaisieValeursTableau {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre d'éléments de votre tableau ?") ;
        final int NB = sc.nextInt() ; 
        
        //création du tableau
        int[] t = new int[NB];
        
        //boucle de sasie des valeurs
        for(int i = 0; i<t.length;i++){
            System.out.println("Valeur numéro "+ (i+1) + "?");
            t[i] = sc.nextInt() ; 
        }
        
        //affichage
        System.out.print("|");
        for(int i = 0; i<t.length;i++){
            System.out.print(" "+ t[i] + " |");
        }
        System.out.println();
    }

}
