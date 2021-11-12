package fr.william.client.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telephone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String numero;
    private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, numero, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		return id == other.id && Objects.equals(numero, other.numero) && type == other.type;
	}
	@Override
	public String toString() {
		return "Telephone [id=" + id + ", numero=" + numero + ", type=" + type + "]";
	}
	public Telephone(String numero, int type) {
		super();
		this.numero = numero;
		this.type = type;
	}
	
	public Telephone(String numero) {
		super();
		this.numero = numero;
	}
    
    public Telephone() {}
}
