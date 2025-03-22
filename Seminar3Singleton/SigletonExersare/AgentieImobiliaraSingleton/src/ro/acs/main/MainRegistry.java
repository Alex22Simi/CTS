package ro.acs.main;

import ro.acs.SingletonRegistry.AgentieImobiliaraRegistry;
import ro.acs.SingletonRegistry.Anunt;
import ro.acs.clase.AgentieImobiliaraLazy;

public class MainRegistry {
    public static void main(String[] args) {
        AgentieImobiliaraRegistry agentieImobiliaraRegistry = new AgentieImobiliaraRegistry("Agentie", 1000);
        Anunt anunt = agentieImobiliaraRegistry.publicaAnunt("Traian", "Ion", 100);
        System.out.println(anunt.toString());
        Anunt anunt2 = agentieImobiliaraRegistry.publicaAnunt("Mircea", "Pavel", 5);
        Anunt anunt3 = agentieImobiliaraRegistry.publicaAnunt("Eminescu", "Marcel", 7);
        System.out.println(anunt3);
    }
}
