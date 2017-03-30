package resursi;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skrVal;
	private GregorianCalendar datumVal;
	private double prodKurs;
	private double kupKurs;
	private double sredKurs;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkrVal() {
		return skrVal;
	}
	public void setSkrVal(String skrVal) {
		this.skrVal = skrVal;
	}
	public GregorianCalendar getDatumVal() {
		return datumVal;
	}
	public void setDatumVal(GregorianCalendar datumVal) {
		this.datumVal = datumVal;
	}
	public double getProdKurs() {
		return prodKurs;
	}
	public void setProdKurs(double prodKurs) {
		this.prodKurs = prodKurs;
	}
	public double getKupKurs() {
		return kupKurs;
	}
	public void setKupKurs(double kupKurs) {
		this.kupKurs = kupKurs;
	}
	public double getSredKurs() {
		return sredKurs;
	}
	public void setSredKurs(double sredKurs) {
		this.sredKurs = sredKurs;
	}
	
}
