package graph;
import java.util.ArrayList;

public abstract class State {
    public int g_state;
    public State parent;
    public String actionStr;
    public int step_from_root;

    public State(int g_state) {
        this.g_state = g_state;
        step_from_root = 0;
    }

    public State(int g_state, State parent, String actionStr){
        this(g_state);
        this.parent = parent;
        this.actionStr = actionStr;
        step_from_root = parent.step_from_root + 1;
    }

    public abstract ArrayList<Action> actionList();
    public abstract String toString();
    public abstract boolean equals(State s);

}
