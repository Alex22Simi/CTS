package ro.acs.flyweight.clase;

public class Recomandare implements IPrintare{
    private String text;
    private TipRecomandare tip;
    @Override
    public void printareReteta(Reteta reteta) {
        System.out.println("Pacientul " + reteta.getNumePacient() + " cu diagnosticul " + reteta.getNumeDiagnostic());
        System.out.println("Recomandari: " + text);
    }

    public Recomandare(TipRecomandare tip) {
        this.tip = tip;
        switch (tip) {
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
        System.out.println("Obiectul " + this.tip  + " s-a creat.");
    }



}
