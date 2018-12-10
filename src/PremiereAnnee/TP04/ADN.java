import java.util.Scanner; // Pour les input

public class Adn {
	
	public static void main (String[] args) {
		
        final String delim = " "; // Délimitation lors de l'affichage des tableaux, initialiser à "\n" pour un retour à la ligne
        
        Scanner sc = new Scanner (System.in); // Iniitalisation du Scanner
        final int nbVal = sc.nextInt(); // La taille du brin correspond à une entrée de l'utlisateur
		
		char[] adn = new char[nbVal]; // Initialisation du talbeau référençant les nucléotides du brin
        char[] ref = {'A','C','T','G'}; // Tableau de référence utilisé pour convertir un nombre entre 1 et 3 en char correspondant à un nucléotide
        int rand;
        
        
        /** Init premier brin **/
        
        // Initialisation du tableau avec des nucléotides aléatoires
        
        for (int i=0;i<nbVal;i++) {
            rand = (int)(Math.random()*4); // Nombre entier aléatoire entre 0 et 3 compris
            adn[i] = ref[rand]; // On fait correspondre l'entier à un nucléotide
        }
        
        System.out.println("Premier brin");
        affichageAdn(adn, delim); // Affichage du tableau grâce à la fonction affichageAdn définie plus bas
        
        
        /** Création deuxième brin **/
        
        char[] adn2 = new char[nbVal]; // Nouveau tableau qui va contenir la séquence miroir
        char copy;
        
        
        // On parcours le tableau en remplaçant chaque nucléotide par son nucléotide miroir
        
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
        affichageAdn(adn2, delim); // Affichage du brin miroir
        
        
        /** Mutation du brin **/
        
        char[] adnMute = new char[nbVal]; // Nouveau tableau pour stocker la séquence mutée
        System.arraycopy(adn,0,adnMute,0, nbVal); // Copie du tableau adn dans adnMute, sans copier la référence
        
        int randPos = (int)(Math.random()*nbVal); // Potision de la mutation aléatoire, entre 0 et le dernier élément
        int randNucl;
        
        // On s'assure que le nucléotide modifié n'est pas celui initial
        
        do {
            randNucl = (int)(Math.random()*4); // Nucléotide aléatoire
        }
        while (adn[randPos] == ref[randNucl]); // On recommence si le nucléotide remplacé est celui initial
        
        adnMute[randPos] = ref[randNucl]; // On fait muter le nucléotide
        
        System.out.println("Brin modifié");
        affichageAdn(adnMute,delim);
        
        
        /** On crée un deuxième brin aléatoire de même taille **/
        
        // Même méthode que pour le brin initial
        char[] adnB = new char[nbVal];
        
        for (int i=0;i<nbVal;i++) {
            rand = (int)(Math.random()*4);
            adnB[i] = ref[rand];
        }
        
        System.out.println("Deuxième brin");
        affichageAdn(adnB,delim);
        
        
        /** Recombinaison de brin **/
        
        int randCut = (int)(Math.random()*(nbVal-2)); // Position de coupe aléatoire entre 0 et l'avant dernier élément; on coupe APRES cet élément
        char[] adnRecomb = new char[nbVal];
        
        // Si i est plus grand que la position de coupe, le nucléotide du brin recombiné provient du second brin, et sinon, du premier brin
        for (int i=0;i<nbVal;i++) {
            if (i<=randCut) {
                adnRecomb[i] = adn[i];
            } else {
                adnRecomb[i]= adnB[i];
            }
        }
        
        System.out.println("Brin recombiné, coupé en position " + randCut);
        affichageAdn(adnRecomb,delim);
	}
    
    
    /** Méthode définie pour afficher un tableau donné en paramètre **/
    public static void affichageAdn(char[] adn, String delim) {
        for (int i=0;i<adn.length;i++) {
            System.out.print(adn[i] + delim);
        }
        System.out.println("\n");
    }
}

