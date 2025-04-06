package ro.acs.clase;

import java.util.ArrayList;

public class Magazin extends AMagazin{

     Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
        this.listaDecoratiuni = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public float calculGradIncendiu() {
         float gradIncendiu = 0.0f;
         gradIncendiu = 10 - this.podea.getDuritate();
         for(IDecoratiuni decoratiune : this.listaDecoratiuni) {
             if(decoratiune.getMaterial() == ETipMaterial.Lemn) {
                 gradIncendiu++;
             } else if(decoratiune.getMaterial() == ETipMaterial.Sticla){
                 gradIncendiu += 2;
             } else if(decoratiune.getMaterial() == ETipMaterial.Plastic) {
                 gradIncendiu += 3;
             }
         }
        return gradIncendiu;
    }

    @Override
    public void addDecoratiune(IDecoratiuni m) throws ExceptieDecoratiune {
         if(this.podea.getDuritate() < 2 && m.getMaterial() == ETipMaterial.Sticla) {
             throw new ExceptieDecoratiune("Nu poti adauga decoratiune de sticla la duritate 2.");
         }
       listaDecoratiuni.add(m);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append("podea=").append(podea);
        sb.append(", listaDecoratiuni=").append(listaDecoratiuni);
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append('}');
        return sb.toString();
    }
}
