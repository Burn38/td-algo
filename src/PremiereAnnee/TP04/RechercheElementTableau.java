import java.util.Scanner;

public class RechercheElementTableau {
    
    public static void main(String[] args) {
        
        int[] t = {3, 12, 20, 15, 18, 16, 14, 18, 13};
        
        Scanner sc = new Scanner(System.in) ;
        //affichage pour l'utilisateur
        System.out.println("De quel entier cherchez-vous la position ?");
        //obtention de la valeur saisie au clavier
        int valeurCherchee = sc.nextInt();
        
        System.out.println("Vous cherchez la valeur : "+ valeurCherchee);
        
        int indiceTrouve = -1;
        for(int i=0;i<t.length;i++) {
            if (t[i] == valeurCherchee) {
                indiceTrouve = i;
                break;
            }
        }
        
        System.out.println("La valeur se trouve à la position: " + indiceTrouve);
        // jeu de tests
        //ecrire ici les valeurs a tester et pourquoi
        // Essayer:
        //18 pour voir si l'indice retourné est bien la première occurence
        //3 car c'est la première valeur
        // 5 car la valeur n'est pas dans le tableau
    }

}
