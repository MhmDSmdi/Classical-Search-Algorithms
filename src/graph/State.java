package graph;
import java.util.ArrayList;

public class State {

    private int g_state;
    private int heuristic;
    private State parentState;
    private String stateName;
    private int step_from_root;
    private ArrayList<Action> actions;

    public State(String stateName, int heuristic) {
        actions = new ArrayList<>();
        this.heuristic = heuristic;
        this.stateName = stateName.toLowerCase();
        step_from_root = 0;
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

    public void setParentState(State parentState, Action action) {
        this.parentState = parentState;
        step_from_root = parentState.step_from_root + 1;
        g_state = action.getStepCost() + parentState.g_state;
    }

    public int getHeuristic() {
        return heuristic;
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
