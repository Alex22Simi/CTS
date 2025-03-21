package ro.acs.main;


import ro.acs.clase.AgentieImobiliaraEager;
import ro.acs.clase.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------EAGER--------------");
        AgentieImobiliaraEager agentieImobiliaraEager = AgentieImobiliaraEager.getInstance();
        System.out.println(agentieImobiliaraEager.toString());
        agentieImobiliaraEager.posteazaAnunt("AnuntNou");
        AgentieImobiliaraEager agentieImobiliaraEager1 = AgentieImobiliaraEager.getInstance();
        System.out.println(agentieImobiliaraEager1.toString());

        System.out.println("-------------------LAZY------------");
        AgentieImobiliaraLazy agentieImobiliaraLazy = AgentieImobiliaraLazy.getInstance("Agent", 1923, "Agent.ro", 10000);
        AgentieImobiliaraLazy agentieImobiliaraLazy1 = AgentieImobiliaraLazy.getInstance("Agen2", 198291, "lala", 19298);
        System.out.println(agentieImobiliaraLazy1.toString());
        agentieImobiliaraLazy1.posteazaAnunt("AnuntAnunt");
        System.out.println(agentieImobiliaraLazy);
    }
}