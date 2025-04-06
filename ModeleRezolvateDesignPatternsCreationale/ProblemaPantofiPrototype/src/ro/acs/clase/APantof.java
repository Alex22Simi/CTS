package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class APantof implements Cloneable{
	protected ETipPantof tipPantof;
	protected EStilPantof stilPantof;
	protected List<String> listaMesaje;
	protected int marimePantof;
	protected String culoare;

	public void setTipPantof(ETipPantof tipPantof) {
		this.tipPantof = tipPantof;
	}

	public void setMarimePantof(int marimePantof) {
		this.marimePantof = marimePantof;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	//adauga un nou mesaj text care o sa fie inscriptionat pe pantof
	public abstract void addMesaj(String mesaj);
	
	//calculeaza pretul folosind o formula ce utilizeaza tipPantof, 
	//listaMesaje si marimePantof
	public abstract void calculeazaPret();


	@Override
	public Object clone() throws CloneNotSupportedException {
		APantof pantofClona = (APantof) super.clone();
		pantofClona.tipPantof = this.tipPantof;
		pantofClona.stilPantof = this.stilPantof;
		pantofClona.listaMesaje = new ArrayList<>(this.listaMesaje);
		pantofClona.marimePantof = this.marimePantof;
		pantofClona.culoare = this.culoare;
		return pantofClona;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("APantof{");
		sb.append("tipPantof=").append(tipPantof);
		sb.append(", stilPantof=").append(stilPantof);
		sb.append(", listaMesaje=").append(listaMesaje);
		sb.append(", marimePantof=").append(marimePantof);
		sb.append(", culoare='").append(culoare).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
