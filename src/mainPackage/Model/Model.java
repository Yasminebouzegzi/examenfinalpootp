package mainPackage.Model;
import java.util.HashMap;
import java.util.Map;

public class Model {
	public enum typechambre{
		chambresimple, chambredouble,chambretwin,suite;
	}
	enum Etatreservation {
		 confirmée, annulée;
	}
	class Date{
		int jour;
		int mois;
		int année;
		public Date(int jour, int mois, int année) {
			super();
			this.jour = jour;
			this.mois = mois;
			this.année = année;
		}
		
		public int getJour() {
			return jour;
		}
		public void setJour(int jour) {
			this.jour = jour;
		}
		public int getMois() {
			return mois;
		}
		public void setMois(int mois) {
			this.mois = mois;
		}
		public int getAnnée() {
			return année;
		}
		public void setAnnée(int année) {
			this.année = année;
		}
	}
	
	class Chambre {
		public int numerochambre;
		public typechambre typechambre;
		boolean dispnible;
		
		
		public Chambre(int numerochambre, mainPackage.Model.Model.typechambre typechambre, boolean dispnible) {
			super();
			this.numerochambre = numerochambre;
			this.typechambre = typechambre;
			this.dispnible = dispnible;
		}
		
		public int getNumerochambre() {
			return numerochambre;
		}
		public void setNumerochambre(int numerochambre) {
			this.numerochambre = numerochambre;
		}
		public typechambre getTypechambre() {
			return typechambre;
		}
		public void setTypechambre(typechambre typechambre) {
			this.typechambre = typechambre;
		}
		public boolean getDispnible() {
			return dispnible;
		}
		public void setDispnible(boolean dispnible) {
			this.dispnible = dispnible;
		}}
		
		
	class Reservation {
			public int idreservation;
			public String nomclient;
			public Date datedebut;
			public Date datefin;
			public Chambre chambre;
			public Etatreservation etat ;
			
			public Reservation(int idreservation, String nomclient, Date datedebut, Date datefin, Chambre chambre,
					Etatreservation etat) {
				super();
				this.idreservation = idreservation;
				this.nomclient = nomclient;
				this.datedebut = datedebut;
				this.datefin = datefin;
				this.chambre = chambre;
				this.etat = etat;
			}
			public int getIdreservation() {
				return idreservation;
			}
			public void setIdreservation(int idreservation) {
				this.idreservation = idreservation;
			}
			public String getNomclient() {
				return nomclient;
			}
			public void setNomclient(String nomclient) {
				this.nomclient = nomclient;
			}
			public Date getDatedebut() {
				return datedebut;
			}
			public void setDatedebut(Date datedebut) {
				this.datedebut = datedebut;
			}
			public Date getDatefin() {
				return datefin;
			}
			public void setDatefin(Date datefin) {
				this.datefin = datefin;
			}
			public Chambre getChambre() {
				return chambre;
			}
			public void setChambre(Chambre chambre) {
				this.chambre = chambre;
			}
			public Etatreservation getEtat() {
				return etat;
			}
			public void setEtat(Etatreservation etat) {
				this.etat = etat;
			}
		}
	public class Client {
		public String nomclient;
		public String prenomclient;
		public int codepostaleclient;
		//private String adresseclient;
		public int numerotlphnclient;
	//	private int motdepassclient;
		public Client(String nomclient, String prenomclient, int codepostaleclient, String adresseclient,
				int numerotlphnclient, int motdepassclient) {
			super();
			this.nomclient = nomclient;
			this.prenomclient = prenomclient;
			this.codepostaleclient = codepostaleclient;
		//	this.adresseclient = adresseclient;
			this.numerotlphnclient = numerotlphnclient;
	//	this.motdepassclient = motdepassclient;
		}
		public String getNomclient() {
			return nomclient;
		}
		public void setNomclient(String nomclient) {
			this.nomclient = nomclient;
		}
		public String getPrenomclient() {
			return prenomclient;
		}
		public void setPrenomclient(String prenomclient) {
			this.prenomclient = prenomclient;
		}
		public int getCodepostaleclient() {
			return codepostaleclient;
		}
		public void setCodepostaleclient(int codepostaleclient) {
			this.codepostaleclient = codepostaleclient;
		}
	
		public int getNumerotlphnclient() {
			return numerotlphnclient;
		}
		public void setNumerotlphnclient(int numerotlphnclient) {
			this.numerotlphnclient = numerotlphnclient;
		}
		
	}
	
	class Administrateur {
		String nom,prenom;
		int modepasse;
		public Administrateur(String nom, String prenom, int modepasse) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.modepasse = modepasse;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public int getModepasse() {
			return modepasse;
		}
		public void setModepasse(int modepasse) {
			this.modepasse = modepasse;
		}	
	}
	
	public Model() {
        // Initialiser mapReservations avec 0 réservations pour chaque type de chambre
        for (typechambre type : typechambre.values()) {
            mapreservations.put(type, 0);
        }
    }
	public Map<Integer, typechambre> mapchambres = new HashMap<>(Map.of(00, typechambre.chambredouble, 01, typechambre.chambredouble, 02, typechambre.chambresimple, 03,typechambre.chambresimple,04,typechambre.chambretwin,05,typechambre.chambretwin,06,typechambre.suite,07,typechambre.suite));
	public Map<typechambre, Integer> mapreservations = new HashMap<>();
	public Map<Integer, typechambre> mapClient = new HashMap<>();
	      

	

}
