package pl.lokw.zastepstwa.dto;

//import java.util.Date;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class NauczycielDTO {

	@NotBlank(message="To pole nie może być puste!")
	private String nazwisko;
	@NotBlank(message="To pole nie może być puste!")
	private String imie;
	@NotBlank(message="To pole nie może być puste!")
	private String skrot;

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



}
