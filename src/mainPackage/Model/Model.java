package mainPackage.Model;

public class Model {
	enum typechambre{
		chambresimple, chambredouble,chambretwin,suite;
	}
	enum Etatreservation {
		enattente, confirmée, annulée;
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
		private int numerochambre;
		private typechambre typechambre;
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
			private int idreservation;
			private String nomclient;
			private Date datedebut;
			private Date datefin;
			private Chambre chambre;
			private Etatreservation etat ;
			
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
	class Client {
		private String nomclient;
		private String prenomclient;
		private int codepostaleclient;
		private String adresseclient;
		private int numerotlphnclient;
		private int motdepassclient;
		public Client(String nomclient, String prenomclient, int codepostaleclient, String adresseclient,
				int numerotlphnclient, int motdepassclient) {
			super();
			this.nomclient = nomclient;
			this.prenomclient = prenomclient;
			this.codepostaleclient = codepostaleclient;
			this.adresseclient = adresseclient;
			this.numerotlphnclient = numerotlphnclient;
			this.motdepassclient = motdepassclient;
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
		public String getAdresseclient() {
			return adresseclient;
		}
		public void setAdresseclient(String adresseclient) {
			this.adresseclient = adresseclient;
		}
		public int getNumerotlphnclient() {
			return numerotlphnclient;
		}
		public void setNumerotlphnclient(int numerotlphnclient) {
			this.numerotlphnclient = numerotlphnclient;
		}
		public int getMotdepassclient() {
			return motdepassclient;
		}
		public void setMotdepassclient(int motdepassclient) {
			this.motdepassclient = motdepassclient;
		}
	}
	
	class Administrateur {
		
	}
	
	

}
