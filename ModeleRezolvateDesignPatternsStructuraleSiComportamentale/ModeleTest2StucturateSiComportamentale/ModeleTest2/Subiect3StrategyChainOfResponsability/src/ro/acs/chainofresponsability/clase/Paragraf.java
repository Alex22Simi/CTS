package ro.acs.chainofresponsability.clase;

public class Paragraf implements Item{
    private String deschiere;
    private boolean esteBolduit;
    private boolean esteItalic;
    private String culoare;

    public Paragraf(String deschiere, boolean esteBolduit, boolean esteItalic, String culoare) {
        this.deschiere = deschiere;
        this.esteBolduit = esteBolduit;
        this.esteItalic = esteItalic;
        this.culoare = culoare;
    }

    public void setEsteBolduit(boolean esteBolduit) {
        this.esteBolduit = esteBolduit;
    }

    public void setEsteItalic(boolean esteItalic) {
        this.esteItalic = esteItalic;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void incarcaInPagina() {
        System.out.println("Paragraful cu descrierea " + this.deschiere + " a fost incarcat in pagina.");
    }

    @Override
    public void getDescriere() {
        System.out.println("Descrierea paragrafului este " + this.deschiere);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paragraf{");
        sb.append("deschiere='").append(deschiere).append('\'');
        sb.append(", esteBolduit=").append(esteBolduit);
        sb.append(", esteItalic=").append(esteItalic);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
