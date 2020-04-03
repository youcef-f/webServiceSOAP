package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

// Il faut annoter les classes qui sont invoquer par jax-ws.
@XmlRootElement(name = "compte")
// Necessaire pour le xmlTransient directement sur les attributs et non sur les methodes
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {

	private Long code;
	private double solde;

	@XmlTransient // attribut masqué du client SOAP
	private Date dateCreation;

	public Compte(Long code, double solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
