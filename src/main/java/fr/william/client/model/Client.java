package fr.william.client.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="CLIENT")
@SecondaryTable(name="ADRESSE", pkJoinColumns={@PrimaryKeyJoinColumn(name="ID_CLIENT")})
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String nom;
    private String prenom;
    
    @Column(length = 32, name = "VOIE", table = "ADRESSE")
    private String voie;
    @Column(length = 32, name = "COMPLT", table = "ADRESSE")
    private String complement;
    @Column(length = 5, name = "CODE_POSTAL", table = "ADRESSE")
    private String codePostal;
    @Column(length = 45, name = "VILLE", table = "ADRESSE")
    private String ville;
    @Column(length = 50, name = "PAYS", table = "ADRESSE")
    private String pays;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codePostal, complement, id, nom, pays, prenom, ville, voie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(codePostal, other.codePostal) && Objects.equals(complement, other.complement)
				&& id == other.id && Objects.equals(nom, other.nom) && Objects.equals(pays, other.pays)
				&& Objects.equals(prenom, other.prenom) && Objects.equals(ville, other.ville)
				&& Objects.equals(voie, other.voie);
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", voie=" + voie + ", complement="
				+ complement + ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + "]";
	}
	public Client(String nom, String prenom, String voie, String complement, String codePostal, String ville,
			String pays) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.voie = voie;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
    
    
}
