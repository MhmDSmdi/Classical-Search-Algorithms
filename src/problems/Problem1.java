package problems;

import graph.Action;
import graph.State;

public class Problem1 extends Problem {

    public Problem1() {
        setupProblem();
    }

    @Override
    public void setupProblem() {
        State s1 = new State("1", 0);
        initialState = s1;
        State s2 = new State("2", 0);
        State s3 = new State("3", 0);
        State s4 = new State("4", 0);
        State s5 = new State("5", 0);
        State s6 = new State("6", 0);
        finalStates.add(s6);
        State s7 = new State("7", 0);
        s1.addAction(new Action(s2, 1));
        s1.addAction(new Action(s3, 1));
        s2.addAction(new Action(s4, 1));
        s2.addAction(new Action(s7, 1));
        s3.addAction(new Action(s4, 1));
        s3.addAction(new Action(s5, 1));
        s4.addAction(new Action(s7, 1));
        s4.addAction(new Action(s6, 1));
        s5.addAction(new Action(s6, 1));


    }

    @Override
    public int hCost(State s) {
        return 0;
    }
}
