package tp1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@Column(columnDefinition = "varchar(64), text NOT NULL DEFAULT")
	private String nom;//(limite à 64 chars ET non null)
	//@Column(columnDefinition = "varchar(64), text NOT NULL DEFAULT")
	private String prenom ;//(limite à 64 chars ET non null) @Column(columnDefinition = "text NOT NULL DEFAULT")
	//@Column(columnDefinition = "varchar(64), text NOT NULL DEFAULT", name ="phone")
	private String telephone;
	private enum genre {Homme, Femme}; //(énumération)
	private LocalDateTime date_naissance;
	private boolean actif; // (booléen avec valeur par défaut à true)
	
	public personne(Long id, String nom, String prenom, String téléphone, LocalDateTime date_naissance, boolean actif) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.date_naissance = date_naissance;
		this.actif = actif;
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getTéléphone() {
		return telephone;
	}
	public void setTéléphone(String téléphone) {
		this.telephone = téléphone;
	}
	public LocalDateTime getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(LocalDateTime date_naissance) {
		this.date_naissance = date_naissance;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
}
 	
