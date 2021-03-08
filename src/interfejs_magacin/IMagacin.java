package interfejs_magacin;

import magacin.Artikal;

public interface IMagacin {

	public void dodajArtikal(Artikal artikal);  //dodavanje novog artikla il povecavanje kolicine postojeceg
	
	public void izbaciArtikal(Artikal artikal); //za smanjivanje kolicine postojeceg
	
	public Artikal vratiArtikal(int sifra);
	
	
	
}
