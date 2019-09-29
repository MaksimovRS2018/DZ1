import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.WakerBehaviour;

public class wake_add_one extends WakerBehaviour {
    private Behaviour lol;
    public wake_add_one(Agent a, long timeout, Behaviour lol) {
        super(a, timeout);
        this.lol = lol;
    }
    @Override
    protected void onWake() {
        System.out.println("Wake added one");
        getAgent().addBehaviour(lol);
    }
}
