package magacin;

import java.util.LinkedList;

import interfejs_magacin.IMagacin;

public class Magacin implements IMagacin {
	private LinkedList<Artikal> artikli;

	@Override
	public void dodajArtikal(Artikal artikal) {
		artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		artikli.remove(artikal);
	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		Artikal mojArtikal = new Artikal();
		for(Artikal a: artikli)
			if(a.getSifra() == sifra)
				mojArtikal = a;
		return mojArtikal;
	}

}
