package ro.cts.seminar1Z.clase;

import ro.cts.seminar1Z.interfete.IPersoana;
import ro.cts.seminar1Z.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private List<Student> studenti;
    private IPredabil profesor;

    public Curs() {
    }

    public Curs(String numeCurs, List<Student> studenti, IPredabil profesor) {
        this.numeCurs = numeCurs;
        this.studenti = studenti;
        this.profesor = profesor;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public void sustinereExamen() {
        StringBuilder sb = new StringBuilder("Cadrul didactic ");
        sb.append(((IPersoana)this.profesor).getNume());
        sb.append(" are examen la ");
        sb.append(this.numeCurs);
        sb.append(" cu urmatorii studenti: ");
        System.out.println(sb);

        for(Student s: studenti)
        {
            System.out.println(s.getNume());
        }

    }
}
