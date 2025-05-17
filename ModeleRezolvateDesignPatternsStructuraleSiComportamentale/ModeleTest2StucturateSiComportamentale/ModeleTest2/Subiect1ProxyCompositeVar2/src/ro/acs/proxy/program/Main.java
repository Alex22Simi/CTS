package ro.acs.proxy.program;

import ro.acs.proxy.clase.ISpital;
import ro.acs.proxy.clase.ProxySpital;
import ro.acs.proxy.clase.Spital;
import ro.acs.proxy.clase.Vizitator;

public class Main {
    public static void main(String[] args) {
        Vizitator vizitator1 = new Vizitator("Alex", true);
        Vizitator vizitator2 = new Vizitator("Cosmina", true);
        Vizitator vizitator3 = new Vizitator("Alin", true);
        Vizitator vizitator4 = new Vizitator("Mada", false);
        Vizitator vizitator5 = new Vizitator("Matei", true);
        Vizitator vizitator6 = new Vizitator("Filip", true);
        Vizitator vizitator7 = new Vizitator("David", true);

        ISpital spital = new Spital("Spital Judetean Brasov");

        ProxySpital spitalProxy = new ProxySpital(spital);

        spitalProxy.permiteAcces(vizitator1);
        System.out.println();
        spitalProxy.permiteAcces(vizitator2);
        System.out.println();
        spitalProxy.permiteAcces(vizitator3);
        System.out.println();
        spitalProxy.permiteAcces(vizitator4);
        System.out.println();
        spitalProxy.permiteAcces(vizitator5);
        System.out.println();
        spitalProxy.permiteAcces(vizitator6);
        System.out.println();
        spitalProxy.permiteAcces(vizitator7);
    }
}