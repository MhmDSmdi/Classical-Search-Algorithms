package algorithms;

import graph.Action;
import graph.State;
import problems.Problem;

import java.util.ArrayList;

public class BFS extends SearchAlgorithm {
    @Override
    protected State searchAFinal(Problem p) {
        State start = p.getInitialState();
        if(p.isFinal(start)){
            return start;
        }
        ArrayList<State> openList  = new ArrayList<>();
        openList.add(start);
        visitedStates.add(start);

        while(!openList.isEmpty()){
            maxMemoryUsage‌ = Math.max(maxMemoryUsage‌, openList.size() + expandedStates.size());
            State s = openList.remove(0);
            expandedStates.add(s);
            for(Action a : s.getActions()) {
                State ns = a.getNextState();
                if(isAddable(ns, openList)) {
                    visitedStates.add(ns);
                    if(p.isFinal(ns)){
                        return ns;
                    }
                    openList.add(ns);
                }
            }
        }
        return null;
    }
}
