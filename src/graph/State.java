package graph;
import java.util.ArrayList;

public abstract class State {
    public int g_state;
    public State parent;
    public String stateName;
    public int step_from_root;

    public State(int g_state, String stateName) {
        this.g_state = g_state;
        this.stateName = stateName;
        step_from_root = 0;
    }

    public State(int g_state, State parent, String stateName){
        this.g_state = g_state;
        this.stateName = stateName;
        this.parent = parent;
        step_from_root = parent.step_from_root + 1;
    }

    public abstract ArrayList<Action> actionList();
    public abstract String toString();
    public abstract boolean equals(State s);

}
