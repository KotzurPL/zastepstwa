package pl.lokw.zastepstwa.domain;

import java.time.LocalTime;
import javax.persistence.*;

@Entity
@Table(name="godzina")
public class Godzina {

    @Id
    @Column(name="id", nullable=false)
    private Integer id;
    
    @Column(name="rozpoczecie", nullable=false)
    private LocalTime rozpoczecie;
    
    @Column(name="zakonczenie", nullable=false)
    private LocalTime zakonczenie;
	
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
	this.id = id;
    }
    
    public LocalTime getRozpoczecie() {
        return rozpoczecie;
	}
	public void setRozpoczecie(LocalTime rozpoczecie) {
		this.rozpoczecie = rozpoczecie;
	}
	public LocalTime getZakonczenie() {
		return zakonczenie;
	}
	public void setZakonczenie(LocalTime zakonczenie) {
		this.zakonczenie = zakonczenie;
	}
}
