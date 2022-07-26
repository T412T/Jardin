package jardin;
import java.util.HashMap;

public class Jardin {

	private int longueur = 10;
	private int largeur = 10;
	private Emplacement emplacements[][];
	private HashMap<String, Integer> panier;

	public Jardin(int lo, int la) {
		panier = new HashMap<String, Integer>();
		this.panier.put("Ail", 4);
		this.panier.put("Bettrave", 7);
		this.panier.put("Carotte", 2);
		this.longueur = lo;
		this.largeur = la;
		
		System.out.println("le jardin a une longueur de " + longueur + " m et une largeur de " + largeur + " m");

		for (String i : panier.keySet()) {
			System.out.println(" key: " + i + " value: " + panier.get(i));
		
		Jardin jardin = new Jardin(10, 10);
		
		public String tostring() {
		
		string text ="Voici notre jardin"
				
		for(int i = 0;  i <longeur ; i++) {
			for(int j = 0; j<largeur; j++) {
				Emplacement e = emplacement [i][j];
				if(e==null) {
					texte += "o";
					j else {
						text +="Somthing";
					}
				}
				texte += "/n";
			}
			text += "Et vottre panier contient : /n";
					ajouterPanier("Tomate",5);
					ajouterPanier("Carotte",5);
					jouterPanier("Ail",10);
					jouterPanier("Betrave",5);
					
					text += println	;
			
			return text
		}
	}
	
		public void ajouterPanier(string s,int i) {
			this.panier.compute(s , i)
		}
}