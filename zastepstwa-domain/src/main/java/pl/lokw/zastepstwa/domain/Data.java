package pl.lokw.zastepstwa.domain;

import java.sql.Date;
import java.util.Calendar;

public class Data {

    private Date dataListaZast;
	
    public Data() {
        this.dataListaZast = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    }

	public Date getDataZastepstwa() {
		return dataListaZast;
	}

	public void setDataZastepstwa(Date dataListaZast) {
		this.dataListaZast = dataListaZast;
	}
}
