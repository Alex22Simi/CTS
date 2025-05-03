package ro.acs.clase;

public class JucatoriFifaApp implements IDate{
    private String nume;
    private String echipa;
    private String pozitie;

    public JucatoriFifaApp(String nume, String echipa, String pozitie) {
        this.nume = nume;
        this.echipa = echipa;
        this.pozitie = pozitie;
    }


    public String getNume() {
        return nume;
    }

    public String getEchipa() {
        return echipa;
    }

    public String getPozitie() {
        return pozitie;
    }
    @Override
    public void transmiteDate() {
        System.out.println("Transmisie jucător Fifa: " + nume + " nume  " + echipa + " echipa, " +  pozitie + " poziție ");
    }


}
