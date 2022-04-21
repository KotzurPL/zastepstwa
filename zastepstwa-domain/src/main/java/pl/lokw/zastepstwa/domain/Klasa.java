package pl.lokw.zastepstwa.domain;

import javax.persistence.*;

@Entity
@Table(name="klasa")
public class Klasa {

    @Id
    @Column(name="id", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="poziom", nullable=false)
    private short poziom;
    
    @Column(name="symbol", nullable=false)
    private String symbol;
    
    @Column(name="typ", nullable=false)
    private String typ;
    
    @Column(name="aktywna", nullable=false)
    private Boolean aktywna;
    
    @Column(name="dlugosc", nullable=false)
    private short dlugosc;
	
    public Klasa() {
        
        this.id = null;
        this.poziom = 0;
        this.symbol = "";
        this.typ = "";
        this.aktywna = null;
        this.dlugosc = 0;
   
    }
    
    public Klasa(short poziom, String symbol, String typ, Boolean aktywna, short dlugosc) {
        
        this.id = null;
        this.poziom = poziom;
        this.symbol = symbol;
        this.typ = typ;
        this.aktywna = aktywna;
        this.dlugosc = dlugosc;
        
    }
    
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
    
	public short getPoziom() {
		return poziom;
	}
	public void setPoziom(short poziom) {
		this.poziom = poziom;
	}
        
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public Boolean getAktywna() {
		return aktywna;
	}
	public void setAktywna(Boolean aktywna) {
		this.aktywna = aktywna;
	}
        /*public void setAktywna(String aktywna) {
            if (aktywna.equals("0")) {
		this.aktywna = false;
            } else {
                this.aktywna = true;
            }
	}*/
	public short getDlugosc() {
		return dlugosc;
	}
	public void setDlugosc(short dlugosc) {
		this.dlugosc = dlugosc;
	}
	
}
