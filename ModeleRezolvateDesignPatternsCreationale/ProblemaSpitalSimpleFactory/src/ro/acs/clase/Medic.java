package ro.acs.clase;

public class Medic extends AbtractPersonalSpital {
     Medic(String nume, int varsta, String departament) {
        super(nume, varsta, departament);
    }

    @Override
    public void getVechimeAproximativa() {
        int vechime = 0;
        if(this.varsta > 30 && this.varsta <= 40) {
            vechime += 10;
        } else if(this.varsta > 40 && this.varsta <= 50) {
            vechime += 20;
        } else if(this.varsta > 50) {
            vechime += 30;
        } else if(this.varsta <= 30) {
            vechime += 5;
        }
        System.out.println("Vechimea personalului este de aproximativ: " + vechime + " ani.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", departament='").append(departament).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
