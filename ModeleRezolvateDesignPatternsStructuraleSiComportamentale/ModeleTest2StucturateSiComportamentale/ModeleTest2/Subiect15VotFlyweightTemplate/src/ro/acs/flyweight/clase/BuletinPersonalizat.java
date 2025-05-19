package ro.acs.flyweight.clase;

public class BuletinPersonalizat implements IPrint{
    private ESectii sectie;
    private String text;

    public BuletinPersonalizat(ESectii sectie) {
        this.sectie = sectie;
       switch(sectie) {
           case VALCEA -> {
               this.text = " a votat in Valcea";
           }
           case BUCURESTI -> {
               this.text =" a votat in Bucuresti";
           }
           case PITESTI -> {
               this.text = " a votat in Pitesti";
           }
           case CLUJ -> {
               this.text = " a votat in Cluj";
           }
       }
        System.out.println("Obiectul s-a creat");
    }

    @Override
    public void printeazaBuletin(Buletin buletin) {
        System.out.println(buletin.getInfo() +  " " + buletin.getVotant() + this.text + ".");
    }
}
