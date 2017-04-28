import java.util.ArrayList;
import java.util.List;

public class Sommet {
	private int id;
	private	int duree;
	private int idaccess; //id du chemin d'acc�s (FINISH)
	private String name;
	private ArrayList<Chemin> pidep = new ArrayList<Chemin>();
	private ArrayList<chemin> pifi = new ArrayList<Chemin>();

	public Sommet(int id,int duree,int idaccess, String name, ArrayList<Chemin> piSt, ArrayList<Chemin> piFi){
		this.id=id;
		this.name = name;
		this.duree=duree;
		this.idaccess= idaccess;
		this.pidep = piSt;
		this.pifi = piFi;

	}

	public int getID(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getIDaccess(){
		return this.idaccess;
	}
	public int getDuree(){
		return this.duree;
	}
	public int modID(int id){
		return this.id = id;
	}
	public ArrayList<Chemin> getSt(){
		return this.pidep;
	}
	public ArrayList<Chemin> getFi(){
		return this.pifi;
	}
	public int modDuree(int duree){
		return this.duree=duree;
	}
	public int modIDaccess(int idaccess){
		return this.idaccess = idaccess;
	}
}
