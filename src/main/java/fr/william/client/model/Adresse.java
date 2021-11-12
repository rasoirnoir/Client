package fr.william.client.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    public Adresse(String voie, String complement, String codePostal, String ville, String pays) {
		super();
		this.voie = voie;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
    
    public Adresse() {}
    

	@Column(length = 32, name = "VOIE")
    private String voie;
    @Column(length = 32, name = "COMPLT")
    private String complement;
    @Column(length = 5, name = "CODE_POSTAL")
    private String codePostal;
    @Column(length = 45, name = "VILLE")
    private String ville;
    @Column(length = 50, name = "PAYS")
    private String pays;
    
    @OneToOne(mappedBy = "adresse")
    private Client client;
    
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String toString() {
		return "Adresse [id=" + id + ", voie=" + voie + ", complement=" + complement + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", pays=" + pays + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codePostal, complement, id, pays, ville, voie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		return Objects.equals(codePostal, other.codePostal) && Objects.equals(complement, other.complement)
				&& id == other.id && Objects.equals(pays, other.pays) && Objects.equals(ville, other.ville)
				&& Objects.equals(voie, other.voie);
	}
}
