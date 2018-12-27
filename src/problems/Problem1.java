package problems;

import graph.State;

import java.util.ArrayList;

public class Problem1 extends Problem {

    @Override
    public State getInitialState() {
        return null;
    }

    @Override
    public boolean isFinal(State s) {
        return false;
    }

    @Override
    public ArrayList<State> getFinalStates() {
        return null;
    }
}
