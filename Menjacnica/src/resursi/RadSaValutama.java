package resursi;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import interfejs.InterfejsMenjacnica;

public class RadSaValutama implements InterfejsMenjacnica {

	@Override
	public void dodajKurs(ArrayList<Valuta> valute, String nazVal, String skrVal, double kupKurs, double sredKurs,
			double prodKurs, GregorianCalendar datumVal) {
			Valuta v = new Valuta();
			v.setDatumVal(datumVal);
			v.setKupKurs(kupKurs);
			v.setProdKurs(prodKurs);
			v.setSredKurs(sredKurs);
			v.setNaziv(nazVal);
			v.setSkrVal(skrVal);
			valute.add(v);
	}

	@Override
	public void izbrisiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datumVal) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datVal) {
		// TODO Auto-generated method stub
		return null;
	}

}
