package fr.pizzeria.model;

public class Pizza {
	int id;
	String code;
	String nom;
	double prix;
	static int nbPizzas;
	
	
	public Pizza(int id, String code, String nom, double prix) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		nbPizzas++;
	}
	
	public Pizza(String code, String nom, double prix) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
	}

	public static int getNbPizzas() {
		return nbPizzas;
	}

	public static void setNbPizzas(int nbPizzas) {
		Pizza.nbPizzas = nbPizzas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
