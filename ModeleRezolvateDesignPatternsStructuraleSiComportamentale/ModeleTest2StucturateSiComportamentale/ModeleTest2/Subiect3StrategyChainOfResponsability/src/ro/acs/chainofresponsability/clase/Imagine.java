package ro.acs.chainofresponsability.clase;

public class Imagine implements Item{
    private String descriere;
    private String src;

    public Imagine(String descriere, String src) {
        this.descriere = descriere;
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    @Override
    public void incarcaInPagina() {
        System.out.println("Imagina cu src " + this.src + " s-a incarcat cu succes.");
    }

    @Override
    public void getDescriere() {
        System.out.println("Imaginea are urmatoarea descriere " + this.descriere);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imagine{");
        sb.append("descriere='").append(descriere).append('\'');
        sb.append(", src='").append(src).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
