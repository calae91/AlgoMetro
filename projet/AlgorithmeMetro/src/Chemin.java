
public class Chemin {
	private int id;
	private String nom;
	private int duree;
	private int depart;
	private int arrivee;
	private int ligne;

	public Chemin(int id,String nom,int duree, int depart, int arrivee, int ligne){
		this.id=id;
		this.nom=nom;
		this.duree=duree;
		this.depart=depart;
		this.arrivee=arrivee;
		this.ligne = ligne;
	}

	public int getID(){
		return this.id;
	}
	public String getNom(){
		return this.nom;
	}
	public String getLigne (){
		return this.ligne;
	}
	public int getStart(){
		return this.depart;
	}
	public int getFinish() {
		return arrivee;
	}
	public int getTime(){
		return this.duree;
	}
}
