public class Exo4 {
	
	public static void main (String args[]) {
            int[] t1 =  {1,8};
            int[] t2 = t1;
            
            System.out.print("t1 = [");
            for (int i=0;i<t1.length-1;i++) {
                System.out.print(t1[i] + ", ");
            }
            System.out.println(t1[t1.length-1] + "]");
            
            System.out.print("t2 = [");
            for (int i=0;i<t2.length-1;i++) {
                System.out.print(t2[i] + ", ");
            }
            System.out.println(t2[t2.length-1] + "]");
            
            t2[0] = 0;
            // On s'attend à ce que t1 aussi soit modifié car t2 est une référence à t1 et non une copie;
            
            System.out.print("\nOn modifie t2;\nt1 = [");
            for (int i=0;i<t1.length-1;i++) {
                System.out.print(t1[i] + ", ");
            }
            System.out.println(t1[t1.length-1] + "]");
            
            System.out.print("t2 = [");
            for (int i=0;i<t2.length-1;i++) {
                System.out.print(t2[i] + ", ");
            }
            System.out.println(t2[t2.length-1] + "]");
	}
}

