package ro.cts.seminar1Z.clase;

public class Student extends Persoana{
   private int idStudent;
   private int aniStudiu;

    public Student() {
        super("Anonim", 1);
        this.idStudent = 0;
    }



    public Student(String nume, int varsta, int idStudent, int aniStudiu) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.aniStudiu = aniStudiu;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAniStudiu() {
        return aniStudiu;
    }

    public void setAniStudiu(int aniStudiu) {
        this.aniStudiu = aniStudiu;
    }
    @Override
    public void afiseazaModInvatare() {
        StringBuilder sb = new StringBuilder("Studentul are ");
        sb.append(this.aniStudiu);
        sb.append(" ani de studiu.");

        System.out.println(sb);


    }
}
