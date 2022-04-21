package pl.lokw.zastepstwa.domain;

import javax.persistence.*;

@Entity
@Table(name="nauczyciel")
public class Nauczyciel {

    @Id
    @Column(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name="nazwisko", nullable=false)
    private String nazwisko;
	
    @Column(name="imie", nullable=false)
    private String imie;
	
    @Column(name="skrot", nullable=false)
    private String skrot;
	
    @Column(name="e_mail", nullable=false)
    private String e_mail;
    
    public Nauczyciel(Integer id, String nazwisko, String imie, String skrot) {
    	this.id = id;
    	this.nazwisko = nazwisko;
    	this.imie = imie;
    	this.skrot = skrot;
    }
    
    public Nauczyciel(String nazwisko, String imie, String skrot) {
    	this.id = null;
    	this.nazwisko = nazwisko;
    	this.imie = imie;
    	this.skrot = skrot;
    }
    
    public Nauczyciel() {
    	this.id = null;
    	this.nazwisko = "";
    	this.imie = "";
    	this.skrot = "";
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    
    public String getSkrot() {
        return skrot;
    }

    public void setSkrot(String skrot) {
        this.skrot = skrot;
    }
    
    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

}
