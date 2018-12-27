package graph;
import java.util.ArrayList;

public class State {

    private int g_state;
    private State parentState;
    private String stateName;
    private int step_from_root;
    private ArrayList<Action> actions;

    public State(int g_state, String stateName) {
        actions = new ArrayList<>();
        this.g_state = g_state;
        this.stateName = stateName;
        step_from_root = 0;
    }

    public State(int g_state, State parentState, String stateName){
        actions = new ArrayList<>();
        this.g_state = g_state;
        this.stateName = stateName;
        this.parentState = parentState;
        step_from_root = parentState.step_from_root + 1;
    }

    public String toString() {
        return "State " + stateName;
    }

    public int getG_state() {
        return g_state;
    }

    public State getParentState() {
        return parentState;
    }

    public String getStateName() {
        return stateName;
    }

    public int getStep_from_root() {
        return step_from_root;
    }

    public void addAction(Action action) {
        actions.add(action);
    }

    public boolean equals(State s) {
        return s.stateName.equals(stateName);
    }

    public ArrayList<Action> getActions() {
        return actions;
    }
}
