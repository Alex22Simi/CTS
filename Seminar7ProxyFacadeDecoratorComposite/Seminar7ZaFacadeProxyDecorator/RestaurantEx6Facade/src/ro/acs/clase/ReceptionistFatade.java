package ro.acs.clase;

public class ReceptionistFatade {
    public String poateLuaLocLaMasa(Masa masa1) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if (masa1.isEsteLibera()) {
            if (picolo.esteDebarasata(masa1)) {
                if (ospatar.esteAranjataMasa(masa1)) {
                    return "Luati loc la masa " + masa1.getNumarulMasa();
                } else {
                    return "Ateptati sa aranjam masa " + masa1.getNumarulMasa();
                }
            } else {
                 return "Asteptati pentru ca tocmai s-a ridicat cineva!";
            }
        } else {
            return "Momentan masa " + masa1.getNumarulMasa() + " nu este disponibila!";
        }
    }
}
