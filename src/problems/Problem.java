package problems;

import graph.State;

import java.util.ArrayList;

public abstract class Problem{

    protected ArrayList<State> finalStates;
    protected ArrayList<State> allState;
    protected State initialState;

    public Problem(){
        finalStates = new ArrayList<>();
        allState = new ArrayList<>();
    }

    public abstract int hCost(State s);

    public void setInitialState(State state) {
        initialState = state;
    }

    public boolean isFinal(State s) {
        return finalStates.contains(s);
    }

    public ArrayList<State> getFinalStates(){
        return finalStates;
    }

    public ArrayList<State> getAllState() {
        return allState;
    }

    public State getInitialState() {
        return initialState;
    }
}
