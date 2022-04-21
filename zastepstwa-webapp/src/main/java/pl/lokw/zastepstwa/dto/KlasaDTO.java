package pl.lokw.zastepstwa.dto;

//import java.util.Date;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class KlasaDTO {

	//@NotBlank(message="To pole nie może być puste!")
	private short poziom;
	
	@NotBlank(message="To pole nie może być puste!")
	private String symbol;
	
	@NotBlank(message="To pole nie może być puste!")
	private String typ;

        //@NotBlank(message="To pole nie może być puste!")
	private Boolean aktywna;
        
        //@NotBlank(message="To pole nie może być puste!")
	private short dlugosc;
        
	/*@NotBlank
	@Pattern(regexp="[0-3]?[0-9]\\.[0-1]?[0-9]\\.[1-2][0-9]{3}")
	private String dataUrodzenia;
	
	@NotNull
	private Float waga;
	
	@NotBlank
	private String imieOpiekuna;*/

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
    public short getDlugosc() {
        return dlugosc;
    }
    public void setDlugosc(short dlugosc) {
        this.dlugosc = dlugosc;
    }
}
