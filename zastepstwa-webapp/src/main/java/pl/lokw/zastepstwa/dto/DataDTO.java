package pl.lokw.zastepstwa.dto;

//import java.util.Date;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

import java.sql.Date;
import org.hibernate.validator.constraints.NotBlank;

public class DataDTO {

	@NotBlank(message="To pole nie może być puste!")
	private Date dataListaZast;

	public Date getDataListaZast() {
		return dataListaZast;
	}

	public void setDataListaZast(Date dataListaZast) {
		this.dataListaZast = dataListaZast;
	}
        
}
