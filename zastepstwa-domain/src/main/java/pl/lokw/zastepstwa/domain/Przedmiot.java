package pl.lokw.zastepstwa.domain;

import javax.persistence.*;

@Entity
@Table(name="przedmiot")
public class Przedmiot {

    @Id
    @Column(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="nazwa", nullable=false)
    private String nazwa;
    
    @Column(name="skrot", nullable=false)
    private String skrot;

    public Przedmiot() {
        this.id = null;
        this.nazwa = "";
        this.skrot = "";
    }
    
    public Przedmiot(String nazwa, String skrot) {
        this.id = null;
        this.nazwa = nazwa;
        this.skrot = skrot;
    }
    
    public Integer getId() {
	return id;
    }
    public void setId(Integer id) {
	this.id = id;
    }
    
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSkrot() {
	return skrot;
    }
    public void setSkrot(String skrot) {
	this.skrot = skrot;
    }
	
}
