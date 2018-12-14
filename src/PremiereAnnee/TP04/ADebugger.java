public class ADebugger {

    public static void main(String[] args) {
       
        int[] tab = {12, 8, 16, 4, 9, 11};
       
        int min = tab[0];
        int pos = 0;
       
        for (int i = 0 ; i<tab.length;i++)  {
            if(tab[i]<min) {
                min = tab[i];
                pos = i;
            }
        }
       
        System.out.println("Le minimum est " + min + " et se trouve en position " + pos);

    
    }
}

//2.2 Ce programme recherche le plus petit élément d'un tableau, puis retourne sa position et sa valeur 
