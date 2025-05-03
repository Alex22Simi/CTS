package ro.acs.clase;

public class AdapterApp implements IDate{
    private JucatoriTvApp jucatorTV;

    public AdapterApp(JucatoriTvApp jucatorTV) {
        this.jucatorTV = jucatorTV;
    }

    @Override
    public void transmiteDate() {
        System.out.println("Adaptare date jucator transmie la TV de la cele de la FIFA.");
       jucatorTV.afiseazaInformatii();
    }
}
