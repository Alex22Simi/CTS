package ro.acs.clase;

public class PachetCazareTransport implements Pachet{

    @Override
    public void afiseazaDescrierePachet() {
        System.out.println("In acest pachet sunt incluse si transportul si cazarea.");
    }
}
