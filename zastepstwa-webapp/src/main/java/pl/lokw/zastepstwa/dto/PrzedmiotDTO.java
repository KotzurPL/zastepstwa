package pl.lokw.zastepstwa.dto;

//import java.util.Date;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class PrzedmiotDTO {
	
	@NotBlank(message="To pole nie może być puste!")
	private String nazwa;
	
	@NotBlank(message="To pole nie może być puste!")
	private String skrot;

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
