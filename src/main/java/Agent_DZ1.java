import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class Agent_DZ1 extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                System.out.println("\033[036;2mHi. I`m "+getLocalName());
            }
        });

        TickerBehaviour ticker = new TickerBehaviour(this,1000) {
            @Override
            protected void onTick() {
                System.out.println("\033[035;1mTick_kek");

            }
        };
        wake_remove_two waker = new wake_remove_two(this,5000,ticker);

        one one1 = new one(this,ticker,waker);
        
        addBehaviour(new wake_add_one(this,1000,one1));
    }
}
