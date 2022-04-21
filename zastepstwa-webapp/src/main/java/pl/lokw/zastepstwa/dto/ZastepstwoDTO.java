package pl.lokw.zastepstwa.dto;

//import java.util.Date;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;

import java.sql.Date;
import java.util.List;
import org.hibernate.validator.constraints.NotBlank;
import pl.lokw.zastepstwa.domain.Nauczyciel;

public class ZastepstwoDTO {

	//@NotBlank(message="To pole nie może być puste!")
	private Date dataZastepstwa;
	
        private Integer nieobecny;
        
        private List<ZastIDS> listaZast;

	public Date getDataZastepstwa() {
		return dataZastepstwa;
	}

	public void setDataZastepstwa(Date dataZastepstwa) {
		this.dataZastepstwa = dataZastepstwa;
	}

    public Integer getNieobecny() {
        return nieobecny;
    }

    public void setNieobecny(Integer nieobecny) {
        this.nieobecny = nieobecny;
    }

    public List<ZastIDS> getListaZast() {
        return listaZast;
    }

    public void setListaZast(List<ZastIDS> listaZast) {
        this.listaZast = listaZast;
    }
        
}
