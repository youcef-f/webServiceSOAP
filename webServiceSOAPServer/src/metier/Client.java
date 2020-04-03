package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

// il faut annoter les classes qui sont invoquer par jax-ws.
@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD) // necessaire pour le xmlTransient directement sur les attributs et non sur les
										// methodes
public class Client implements Serializable {

	private String nom;

	@XmlTransient // attribut masqué du client SOAP
	private String age;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Client(String nom, String age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public Client() {
		super();
	}

}
