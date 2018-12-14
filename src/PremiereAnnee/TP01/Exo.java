public class Exo{ 
    public static void main(String[] args) {
		int x; //1
		x = 1000+(1+2)*100+(2+1)*10+1; //2
        System.out.println("Le résultat est "+x); //3
		System.out.println("Le résultat est "+x+ ". Bravo!"); //4 on concatène différents types avec l'opérateur "+"
		
		char c = 'W'; //5
		System.out.println("Le caractère " + c + " est la valeur de la variable c."); //6
		
		char z = 'z'; //7
		boolean b= c<z; //8
        
		System.out.println(b);
		//Donne un résultat en conmparant la valeur ASCII du caractère: A=65, W=87, a=97 etc.
		
        
        //10//
		if (Character.toLowerCase(z) == z) {System.out.println("true");}
		else {System.out.println("false");}
		
		// OR
		
		if (z>'Z') {System.out.println("true");}
		else {System.out.println("false");}
        
        ////
	}
}
