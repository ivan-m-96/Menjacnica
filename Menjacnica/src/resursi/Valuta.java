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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumVal == null) ? 0 : datumVal.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skrVal == null) ? 0 : skrVal.hashCode());
		temp = Double.doubleToLongBits(sredKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datumVal == null) {
			if (other.datumVal != null)
				return false;
		} else if (!datumVal.equals(other.datumVal))
			return false;
		if (Double.doubleToLongBits(kupKurs) != Double.doubleToLongBits(other.kupKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodKurs) != Double.doubleToLongBits(other.prodKurs))
			return false;
		if (skrVal == null) {
			if (other.skrVal != null)
				return false;
		} else if (!skrVal.equals(other.skrVal))
			return false;
		if (Double.doubleToLongBits(sredKurs) != Double.doubleToLongBits(other.sredKurs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta: " + naziv + " " + skrVal + " " + datumVal.getTime() + " prodajni kurs:" + prodKurs
				+" srednji kurs: " + sredKurs + " kupovni kurs: " + kupKurs;
	}
	
}
