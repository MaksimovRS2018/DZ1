import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;

public class one extends OneShotBehaviour {
    private Behaviour lol1;
    private Behaviour lol2;

    public one(Agent_DZ1 agent_dz, TickerBehaviour ticker, wake_remove_two waker) {
        super(agent_dz);
        this.lol1 = ticker;
        this.lol2 = waker;
    }

    public void action() {
        System.out.println("\033[030;2mHi. I`m one");
        getAgent().addBehaviour(lol1);
        System.out.println("\033[030;2mOne added ticker");
        getAgent().addBehaviour(lol2);
        System.out.println("\033[030;2mOne added waker");
    }


}
