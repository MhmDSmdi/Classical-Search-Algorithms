package graph;

public class Action {

    private State nextState;
    private int stepCost;

    public Action(State nextState, int stepCost){
        this.nextState = nextState;
        this.stepCost = stepCost;
    }

    public State getNextState() {
        return nextState;
    }

    public int getStepCost() {
        return stepCost;
    }

}
