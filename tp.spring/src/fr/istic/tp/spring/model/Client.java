package fr.istic.tp.spring.model;

public class Client extends Person implements IClient{

	private Integer compte_bancaire;

	public Integer getCompte_bancaire() {
		return compte_bancaire;
	}

	public void setCompte_bancaire(Integer compte_bancaire) {
		this.compte_bancaire = compte_bancaire;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
