public class Melange
{
    public static void main(String[] arg) {
        int temp = 5;
        int res = method3(temp); 
        
        System.out.println("programme => " + res);
        Method_1(temp); 
        System.out.println("programme => " + temp);
        
    }
    
    public static void Method_1(int nb) {
        nb += 1;
        System.out.println("m1 => " + 7 + " et " + nb);
    }

    public static boolean method2 (int nb) {
        nb += 1; 
        System.out.println("m2 => 1er affichage : " + nb);
        
        return (nb>5);
    }

    public static int method3 (int nb) {
        System.out.println("m3 => 1er affichage : " + nb);
        
        if (method2(nb)) {
			System.out.println("m3 => 2eme affichage : " + nb);
        } else
        {
            nb += 1;
            System.out.println("m3 => 3eme affichage : " + nb);
        }
        return nb;
    }
}


