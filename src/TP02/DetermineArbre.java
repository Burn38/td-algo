package TP02;

public class DetermineArbre {

    /**
     * Ce programme illustre l'utilisation du type booléen dans des instructions conditionnelles. Il permet d'identifier
     * un arbre à partir d'observations (feuilles simples ou pas, alternées, etc) ; Les observations sont codées sous
     * forme de constantes de type booléen. La valeur d'une constante n'est pas modifiée durant l'exécution du
     * programme. Nous supposons que la forêt observée est constituée uniquement d'Erables, de Chênes, de Charmes, de
     * Tilleuls et de Frênes. Les rêgles utilisées sont une simplification de celles proposées par l'ONF à l'adresse :
     * http://www.onf.fr/activites_nature/++oid++8ac/@@display_advise.html
     */
    public static void main(String[] args) {

        // Déclaration des constantes booléennes: les observations à un certain moment.
        // Ces observations n'évoluent pas pendant la durée du programme.
        final boolean FEUILLES_SIMPLES = true; // FEUILLES_SIMPLES vrai si l'arbre a des feuilles simples
        final boolean FEUILLES_ALTERNEES = true; // FEUILLES_ALTERNEES vrai s'il a des feuilles alternées
        final boolean BORD_DENTE = true; //  BORD_DENTE vrai si le bord des feuilles est denté
        final boolean DENTS_FINES = true; //DENTS_FINES vrai si les dents au bord des feuilles sont fines
        final boolean ECORCE_LISSE = true; //ECORCE_LISSE vrai si l'écorce de l'arbre est lisse
        final boolean FEUILLE_COEUR = true; //FEUILLE_COEUR vrai si la feuille a la forme d'un coeur
        final boolean BOUT_POINTU = true; //BOUT_POINTU vrai si le bout de la feuille est pointu
        final boolean FLEURS_ODORANTES = true; //BOUT_POINTU vrai si le bout de la feuille est pointu

        if (FEUILLES_SIMPLES) {
            System.out.println("Le spécimen a des feuilles simples.");
            if (FEUILLES_ALTERNEES) {
                System.out.println("Il a des feuilles alternées.");
                if (BORD_DENTE) {
                    System.out.println("Il a des feuilles dentées.");
                    if (DENTS_FINES && ECORCE_LISSE) {
                        System.out.println("Les dents sont fines et l'écorce est lisse");
                        System.out.println("Cela pourrait être : un Charme (Hornbeam, en anglais) ");
                    }
                    if (FEUILLE_COEUR && BOUT_POINTU && FLEURS_ODORANTES) {
                        System.out.println("Elles ont la forme d'un coeur avec un bout pointu");
                        System.out.println("Cela pourrait être : un Tilleul (Linden Tree, en anglais) ");
                    }
                } else { //les bords de feuilles ne sont pas dentés
                    System.out.println("Il a des feuilles à bord lobé (et non denté).");
                    System.out.println("Cela pourrait être : un Chêne (Oak, en anglais)");
                }

            } else { // les feuilles ne sont pas alternées mais opposées
                System.out.println("Il a des feuilles opposées.");
                System.out.println("Cela pourrait être : un Erable (Maple, en anglais) ");
            }
        } else { //les feuilles ne sont pas simples ; elles sont composées
            System.out.println("Le spécimen a des feuilles composées.");
            System.out.println("Cela pourrait être : un Frêne (Ash tree, en anglais) ");
        }

    }

}

/*
 * Défaut : Charme (Hornbeam)
 * Cas 1 : Chêne
 * Cas 2 : Chêne
 * Cas 3 : Charme ou Tilleul
 */
