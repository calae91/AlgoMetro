import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Algo {
	Statement statement = null;
	ResultSet resultat = null;
	ResultSet resultat2=null;

	public void algo(Connection connexion) throws SQLException{
		try{
			//Connection a la bdd

			statement = connexion.createStatement();
			/*executeQuery() ==> lecture de donn�e via une requ�te de type SELECT
			 *executeUpdate()==> ecriture/suppression  ... de type INSERT/UPDATE/DELETE*/
			//resultat effectue un requ�te sur la table pistes et demande les noms
<<<<<<< HEAD

			//table de hachage avec cl� id de la piste

			HashMap<Integer,Chemin> chemins = new HashMap<Integer, Chemin>();
			//on remplit
			resultat = statement.executeQuery( "SELECT Id, Nom, time, start, finish, Ligne FROM chemin;" );
			chemins = rempCheminId(chemins, statement, resultat);
			System.out.println(chemins.get(1).getNom());
			// table de Hashage des sommets avec cl� ID des sommets
			HashMap<Integer, Sommet> SommetId = new HashMap<Integer, Sommet>();
			//on remplit
			resultat = statement.executeQuery("SELECT Id, Nom, time, start, finish, Ligne FROM chemin;" );
			SommetId = rempSommetId( SommetId, statement, resultat, chemins);
			// on demande le level du user


			ArrayList<Integer> cheminsFinal = new ArrayList<Integer>(); //Contient les donn�es des pistes
			ArrayList<Integer> aTraiter = new ArrayList<Integer>();//Sommet � traiter

			int depart;
			int arrivee;

			depart = 1;
			arrivee = 128;
			System.out.println("try to remember :" + SommetId.get(37).getSt().get(3).getNom());
			// on cherhe a savoir si le chemin est possible

		}
		catch(Exception e){
			System.out.println(e);
		}
			finally{
				if(resultat!=null)
						resultat.close();
				if(statement!=null)
					statement.close();
			}
	}

<<<<<<< HEAD
// fonction principale permettant la recherche du plus cours chemin
	public HashMap<Integer, Sommet> rechercherChemin(int current, HashMap<Integer, Chemin> chemins, HashMap<Integer, Sommet> sommets, ArrayList<Integer> aTraiter){
		// on s'arrete si on a plus rien a traiter
		if(aTraiter.isEmpty()){
			return sommets;
		}
		// sinon pour chaques sommets ou on est (current) on prend la liste des pistes qui partent de ce sommet via la HashMap pisteSt
		// evite de reecrire sommets.get(current) 1 000 000 000 de fois
		Sommet s = sommets.get(current);
		Sommet j;
		int i=0;
		for (Chemin p1 : s.getSt()){
			if ((sommets.get(p1.getFinish()).getDuree() > s.getDuree() + p1.getTime() ) ||( sommets.get(p1.getFinish()).getDuree() == -1)){
				 j = sommets.get(p1.getFinish());
				 j.modDuree(p1.getTime() + s.getDuree());
				 j.modIDaccess(p1.getID());
				sommets.put(p1.getFinish(), j);
				for (int k: aTraiter){
					if (k == p1.getFinish()){
						i = 1;
					}
				}
				if (i==0){
					aTraiter.add(p1.getFinish());
				}
				i=0;
			}
		}
		aTraiter.remove(0);
		if(aTraiter.isEmpty()){
			return sommets;
		}
		return rechercherChemin(aTraiter.get(0), chemins, sommets, aTraiter);
	}


//on cherche le chemin qu'on a obtenu
	public ArrayList<Integer> chercheCheminFinal (ArrayList<Integer> fin, int depart, int arrivee, HashMap<Integer, Chemin> chemins, HashMap<Integer, Sommet> sommets){
		int current = arrivee;
		while (sommets.get(current).getID() != depart){
				fin.add(0, chemins.get(sommets.get(current).getIDaccess()).getID());
				current = chemins.get(fin.get(0)).getStart();
			}
			return fin;
		}


// on affiche notre chemin :
	public void afficherChemin(ArrayList<Integer> pif, HashMap<Integer, Sommet> sommets, HashMap<Integer, Chemin> chemins){
		for(Integer i : pif){
			System.out.println("Partir de " + sommets.get(chemins.get(i).getStart()).getName() + "Temps �coul� (environ) : " + sommets.get(chemins.get(i).getStart()).getDuree() + " min(s)");
			System.out.println("Prendre le chemin :" + chemins.get(i).getNom() + " Couleur : " + chemins.get(i).getColor());
		}
	}


	public HashMap<Integer, Chemin> rempCheminId(HashMap<Integer, Chemin> chemins, Statement statement, ResultSet resultat){
		try{
			while(resultat.next()){
				chemins.put(resultat.getInt("Id"), new Chemin(resultat.getInt("Id"), resultat.getString("Nom"), resultat.getInt("time"), resultat.getInt("start"), resultat.getInt("finish"), resultat.getString("Ligne")) );
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return chemins;
	}


	public HashMap<Integer, Sommet> rempSommetId(int level, HashMap<Integer, Sommet> SommetId, Statement statement, ResultSet resultat, HashMap<Integer, Chemin> chemins){
		try {
			while (resultat.next()){
				ArrayList<Chemin> piSt = new ArrayList<Chemin>();
				ArrayList<Chemin> piFi = new ArrayList<Chemin>();

				Iterator<Integer> setkey = chemins.keySet().iterator();
				while (setkey.hasNext()){
					 Integer key = setkey.next();
					if ( chemins.get(key).getStart() == resultat.getInt("ID"))
						piSt.add(chemins.get(key));
					if ( chemins.get(key).getFinish() == resultat.getInt("ID"))
						piFi.add( chemins.get(key));
				}


				SommetId.put(resultat.getInt("ID"), new Sommet(resultat.getInt("ID"), -1, 0, resultat.getString("NAME"), piSt, piFi));
				}

			}
			catch( Exception e){
				System.out.println(e);
			}
				return SommetId;
	}

}
