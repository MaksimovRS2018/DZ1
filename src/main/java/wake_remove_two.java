import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.WakerBehaviour;

public class wake_remove_two extends WakerBehaviour {

    private Behaviour lol;

    public wake_remove_two(Agent a, long timeout, Behaviour lol) {
        super(a, timeout);
        this.lol = lol;
    }

    @Override
    protected void onWake() {
        System.out.println("\033[037;1mFirst waker removed ticker");
        getAgent().removeBehaviour(lol);
//
    }
}
