package ro.cts.seminar1Z.clase;

import ro.cts.seminar1Z.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private int idAngajat;
    private int vechime;

    public Profesor() {
        super("AngajatAnonim", 2);
        this.idAngajat = 0;
        this.vechime = 0;
    }



    public Profesor(String nume, int varsta, int idAngajat, int vechime) {
        super(nume, varsta);
        this.idAngajat = idAngajat;
        this.vechime = vechime;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void preda() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(" preda la curs.");
        System.out.println(sb);
    }
    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(super.nume);
        sb.append(" invata prin invatare de ");
        sb.append(this.vechime);
        sb.append(" ani.");

        System.out.println(sb);
    }
}
