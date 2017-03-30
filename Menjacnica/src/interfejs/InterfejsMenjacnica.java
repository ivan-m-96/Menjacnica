package interfejs;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import resursi.Valuta;

public interface InterfejsMenjacnica {
	public void dodajKurs(ArrayList<Valuta> valute, String nazVal, String skrVal, double kupKurs, double sredKurs, double prodKurs, GregorianCalendar datumVal);
	public void izbrisiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datumVal);
	public Valuta pronadjiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datVal);
}
