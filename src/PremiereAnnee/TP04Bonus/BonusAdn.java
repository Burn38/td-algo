import java.util.Scanner;

public class BonusAdn {
	
	public static void main (String[] args) {
        final String delim = " ";
        
        Scanner sc = new Scanner (System.in);
        final int nbVal = sc.nextInt();
		char[] adn = new char[nbVal];
        char[] ref = {'A','C','T','G'};
        int rand;
        
        
        /** Init premier brin **/
        for (int i=0;i<nbVal;i++) {
            rand = (int)(Math.random()*4);
            adn[i] = ref[rand];
        }
        
        System.out.println("Premier brin");
        affichageAdn(adn, delim);
        
        /** Création deuxième brin **/
        char[] adn2 = new char[nbVal];
        char copy;
        
        for (int i=0;i<nbVal;i++) {
            copy = adn[i];

            if (copy == 'A')
                adn2[i] = 'T';
            if (copy == 'T')
                adn2[i] = 'A';
            if (copy == 'C')
                adn2[i] = 'G';
            if (copy == 'G')
                adn2[i] = 'C';
        }
        
        System.out.println("Brin miroir");
        affichageAdn(adn2, delim);
        
        
        /** Mutation du brin **/
        char[] adnMute = new char[nbVal];
        System.arraycopy(adn,0,adnMute,0, nbVal); // Copie adn dans adnMute, sans copier la référence
        
        int randPos = (int)(Math.random()*nbVal);
        int randNucl;
        
        // On s'assure que le nucléotide modifié n'est pas celui initial
        do {
            randNucl = (int)(Math.random()*4);
        }
        while (adn[randPos] == ref[randNucl]);
        
        adnMute[randPos] = ref[randNucl];
        
        /** Affichage du brin modifié **/
        System.out.println("Brin modifié");
        affichageAdn(adnMute,delim);
        
        /** On crée un deuxième brin aléatoire de même taille **/
        char[] adnB = new char[nbVal];
        
        for (int i=0;i<nbVal;i++) {
            rand = (int)(Math.random()*4);
            adnB[i] = ref[rand];
        }
        
        System.out.println("Deuxième brin");
        affichageAdn(adnB,delim);
        
        /** Recombinaison de brin **/
        int randCut = (int)(Math.random()*(nbVal-2));
        char[] adnRecomb = new char[nbVal];
        
        for (int i=0;i<nbVal;i++) {
            if (i<=randCut) {
                adnRecomb[i] = adn[i];
            } else {
                adnRecomb[i]= adnB[i];
            }
        }
        
        /** Affichage du brin recombiné **/
        System.out.println("Brin recombiné, coupé en position " + randCut);
        affichageAdn(adnRecomb,delim);
	}
    
    public static void affichageAdn(char[] adn, String delim) {
        for (int i=0;i<adn.length;i++) {
            System.out.print(adn[i] + delim);
        }
        System.out.println("\n");
    }
}

