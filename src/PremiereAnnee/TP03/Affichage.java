import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Affichage extends JPanel {

    private static int Size = 500;
    private static int nbLignes = 0;
    private static int[][] lignes = null;
	private static int xc=Size/3;
	private static int yc=Size/3;
	private static int ac=90;
	private static int color = 0;
	private static Affichage world = new Affichage();
	public Color[] C = {Color.black,Color.gray,Color.blue,Color.cyan,Color.green, Color.magenta,Color.orange,Color.pink,Color.red,Color.yellow};

	public void paint(Graphics g) {
		for(int i=0; i<nbLignes; i++){
			g.setColor(C[lignes[i][4]]); 
			g.drawLine(lignes[i][0], lignes[i][1], lignes[i][2], lignes[i][3]);  
		}
	}

	public static void afficher(){
		JFrame frame = new JFrame("Artiste version JAVA");
		frame.getContentPane().add(world);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Size,Size);
		frame.setVisible(true);
	}
	
	private static int[][] addLignes(int x0, int y0, int x1, int y1){
		// init
		int[][] newLignes = new int[nbLignes+1][5];
		
		// copy
		for(int i=0; i<nbLignes; i++)
			for(int j=0; j<5; j++)
				newLignes[i][j] = lignes[i][j];
		
		// add		
		newLignes[nbLignes][0] = x0;
		newLignes[nbLignes][1] = y0;
		newLignes[nbLignes][2] = x1;
		newLignes[nbLignes][3] = y1;
		newLignes[nbLignes][4] = color;
		
		nbLignes++;
		// return
		return newLignes;
	}
	
	public static void avancer (int pas){
		int xf;
		int yf;
		
		xf = xc + (int)Math.round (pas * Math.sin(ac * Math.PI/180.));
		yf = yc - (int)Math.round (pas * Math.cos(ac * Math.PI/180.));
		
		lignes = addLignes(xc, yc, xf, yf);
		xc = xf;
		yc = yf;
	}
	
	public static void tourner (boolean droite, int angle){
		if(droite){
			ac+=angle;
			
			if(ac>=360)
				ac -= 360;
		}
		else{
			ac -= angle;
			
			if(ac<0)
				ac += 360;
		}
	}
	
	public static void choixCouleur (int c){
		color = c;
	}

	public static void saut (int pas){
		int xf;
		int yf;
		
		xf = xc + (int) (pas * Math.sin(ac * Math.PI/180.));
		yf = yc - (int) (pas * Math.cos(ac * Math.PI/180.));
		
		xc = xf;
		yc = yf;
	}

	public static void init (int c, int x, int y, int a){
		color = c;
		xc = x;
		yc = y;
		ac = a;
	}

}
