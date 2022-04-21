/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lokw.zastepstwa.dto;

/**
 *
 * @author Kotzur
 */
public class ZastIDS {
    private Integer klasaID;
    private Integer pierwotnyID;
    private Integer zastepujacyID;
    private Integer docelowyID;

    public Integer getKlasaID() {
        return klasaID;
    }

    public void setKlasaID(Integer klasaID) {
        this.klasaID = klasaID;
    }

    public Integer getPierwotnyID() {
        return pierwotnyID;
    }

    public void setPierwotnyID(Integer pierwotnyID) {
        this.pierwotnyID = pierwotnyID;
    }

    public Integer getZastepujacyID() {
        return zastepujacyID;
    }

    public void setZastepujacyID(Integer zastepujacyID) {
        this.zastepujacyID = zastepujacyID;
    }

    public Integer getDocelowyID() {
        return docelowyID;
    }

    public void setDocelowyID(Integer docelowyID) {
        this.docelowyID = docelowyID;
    }
    
    
}
