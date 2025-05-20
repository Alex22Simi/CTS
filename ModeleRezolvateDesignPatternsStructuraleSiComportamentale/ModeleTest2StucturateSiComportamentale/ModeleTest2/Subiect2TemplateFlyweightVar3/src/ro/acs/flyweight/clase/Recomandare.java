package ro.acs.flyweight.clase;

public class Recomandare implements IPrintare{
    private ERecomandari tipRecomandari;
    private String text;

    public Recomandare(ERecomandari tipRecomandari) {
        this.tipRecomandari = tipRecomandari;
        switch(tipRecomandari) {
            case SANATATE_GENERALA -> {
                this.text = "Bea minim 2 litrii pe zi si dormi 8 ore.";
            }
            case SPORT -> {
                this.text = "Fa miscare 30 de minute zilnic, stai in aer liber.";
            }
            case NUTRITIE -> {
                this.text = "Evitati excesul de zahar si grasimi.";
            }
        }
        System.out.println("Obiectul a fost creat.");
    }

    @Override
    public void printeaza(Reteta reteta) {
        System.out.println("Pacientul " + reteta.getNumePacient() + " cu diagnosticul " + reteta.getDiagnostic());
        System.out.println("Recomandari: " + text);
    }
}
