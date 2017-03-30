package resursi;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skrVal;
	private GregorianCalendar datumVal;
	private double prodKurs;
	private double kupKurs;
	private double sredKurs;
	
	
	public Valuta(String naziv, String skrVal, GregorianCalendar datumVal, double prodKurs, double kupKurs,
			double sredKurs) {
		super();
		this.naziv = naziv;
		this.skrVal = skrVal;
		this.datumVal = datumVal;
		this.prodKurs = prodKurs;
		this.kupKurs = kupKurs;
		this.sredKurs = sredKurs;
	}

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv != null || !naziv.isEmpty())
		this.naziv = naziv;
		else
			throw new RuntimeException("Niste uneli naziv.");
	}
	public String getSkrVal() {
		return skrVal;
	}
	public void setSkrVal(String skrVal) {
		if(skrVal != null || !skrVal.isEmpty())
		this.skrVal = skrVal;
		else
			throw new RuntimeException("Niste uneli skracenicu.");

	}
	public GregorianCalendar getDatumVal() {
		return datumVal;
	}
	public void setDatumVal(GregorianCalendar datumVal) {
		if(datumVal!=null)
		this.datumVal = datumVal;
		else
			throw new RuntimeException("Niste uneli datum.");

	}
	public double getProdKurs() {
		return prodKurs;
	}
	public void setProdKurs(double prodKurs) {
		if(prodKurs > 0)
		this.prodKurs = prodKurs;
		else
			throw new RuntimeException("Niste uneli prodajni kurs.");

	}
	public double getKupKurs() {
		return kupKurs;
	}
	public void setKupKurs(double kupKurs) {
		if(kupKurs > 0)
		this.kupKurs = kupKurs;
		else
			throw new RuntimeException("Niste uneli kupovni kurs.");

	}
	public double getSredKurs() {
		return sredKurs;
	}
	public void setSredKurs(double sredKurs) {
		if(sredKurs > 0)
		this.sredKurs = sredKurs;
		else
		throw new RuntimeException("Niste uneli srednji kurs.");

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
