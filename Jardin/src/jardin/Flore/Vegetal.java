package jardin.Flore;

public class Vegetal {
	
	protected Etat etat;
	
	String dessin[];
	
	
	
	
	public Vegetal() {
		
		this.etat = Etat.GRAINE;
		
		dessin = new String[6];
		
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";
	}
	
}