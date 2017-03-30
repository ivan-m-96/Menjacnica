package resursi;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import interfejs.InterfejsMenjacnica;

public class RadSaValutama implements InterfejsMenjacnica {
	
	@Override
	public void dodajKurs(ArrayList<Valuta> valute, String nazVal, String skrVal, double kupKurs, double sredKurs,
			double prodKurs, GregorianCalendar datumVal) {

		valute.add(new Valuta(skrVal, skrVal, datumVal, prodKurs, prodKurs, prodKurs));

	}

	@Override
	public void izbrisiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datumVal) {
		
		valute.remove(pronadjiKurs(valute, skrVal, datumVal));
	}

	@Override
	public Valuta pronadjiKurs(ArrayList<Valuta> valute, String skrVal, GregorianCalendar datVal) {
		if(!valute.isEmpty()){
			
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getDatumVal().equals(datVal) && valute.get(i).getSkrVal().equals(skrVal))
					return valute.get(i);
			}
			
			
		}
			
			throw new RuntimeException("Ne postoji takva valuta.");
		
		
	}

}
