package fr.istic.tp.spring.model;

public class Person {

	private String name;
	private String adresse;
	private String mail;
	
	public Person() {
			}
	
	public Person(String name, String adresse, String mail) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
