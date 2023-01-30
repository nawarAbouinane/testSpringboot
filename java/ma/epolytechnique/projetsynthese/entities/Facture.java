package ma.epolytechnique.projetsynthese.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero_fact;
	private Float montant;
	private String etat;
	private Date date_fact;
	
	public int getNum_fact() {
		return numero_fact;
	}
	public void setNum_fact(int num_fact) {
		this.numero_fact = num_fact;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_fact() {
		return date_fact;
	}
	public void setDate_fact(Date date_fact) {
		this.date_fact = date_fact;
	}
	public Facture(int num_fact, Float montant, String etat, Date date_fact) {
		super();
		this.numero_fact = num_fact;
		this.montant = montant;
		this.etat = etat;
		this.date_fact = date_fact;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

}

