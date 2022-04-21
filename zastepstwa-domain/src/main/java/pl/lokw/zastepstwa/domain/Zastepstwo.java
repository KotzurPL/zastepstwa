package pl.lokw.zastepstwa.domain;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="zastepstwo")
public class Zastepstwo {

    @Id
    @Column(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="data", nullable=false)
    private Date data;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_nauczyciel_nieobecny")//, referencedColumnName="id")
    //@Column(name="id_nauczyciel_nieobecny", nullable=false)
    private Nauczyciel nauczycielNieobecny;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_godzina")
    private Godzina godzina;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_klasa")
    //@Column(name="id_klasa", nullable=false)
    private Klasa klasa;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_przedmiot_pierwotny")
    //@Column(name="id_przedmiot_pierwotny", nullable=false)
    private Przedmiot przedmiotPierwotny;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_nauczyciel_zastepujacy")
    //@Column(name="id_nauczyciel_zastepujacy", nullable=false)
    private Nauczyciel nauczycielZastepujacy;
    
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name="id_przedmiot_docelowy")
    //@Column(name="id_przedmiot_docelowy", nullable=false)
    private Przedmiot przedmiotDocelowy;

    public Long getId() {
	return id;
    }
    public void setId(Long id) {
	this.id = id;
    }
    
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    public Nauczyciel getNauczyciel_nieobecny() {
        return nauczycielNieobecny;
    }
    public void setNauczyciel_nieobecny(Nauczyciel nauczycielNieobecny) {
        this.nauczycielNieobecny = nauczycielNieobecny;
    }

    public Godzina getGodzina() {
        return godzina;
    }
    public void setGodzina(Godzina godzina) {
        this.godzina = godzina;
    }

    public Klasa getKlasa() {
        return klasa;
    }
    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public Przedmiot getPrzedmiot_pierwotny() {
        return przedmiotPierwotny;
    }
    public void setPrzedmiot_pierwotny(Przedmiot przedmiotPierwotny) {
        this.przedmiotPierwotny = przedmiotPierwotny;
    }

    public Nauczyciel getNauczyciel_zastepujacy() {
        return nauczycielZastepujacy;
    }
    public void setNauczyciel_zastepujacy(Nauczyciel nauczycielZastepujacy) {
        this.nauczycielZastepujacy = nauczycielZastepujacy;
    }

    public Przedmiot getPrzedmiot_docelowy() {
        return przedmiotDocelowy;
    }
    public void setPrzedmiot_docelowy(Przedmiot przedmiotDocelowy) {
        this.przedmiotDocelowy = przedmiotDocelowy;
    }

    public Zastepstwo() {
    }

    public Zastepstwo(Date data, Nauczyciel nauczycielNieobecny, Godzina godzina, Klasa klasa, Przedmiot przedmiotPierwotny, Nauczyciel nauczycielZastepujacy, Przedmiot przedmiotDocelowy) {
        this.id = null;
        this.data = data;
        this.nauczycielNieobecny = nauczycielNieobecny;
        this.godzina = godzina;
        this.klasa = klasa;
        this.przedmiotPierwotny = przedmiotPierwotny;
        this.nauczycielZastepujacy = nauczycielZastepujacy;
        this.przedmiotDocelowy = przedmiotDocelowy;
    }
    
    

}
