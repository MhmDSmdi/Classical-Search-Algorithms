package algorithms;

import graph.Action;
import graph.State;
import problems.Problem;

import java.util.ArrayList;

public class DFS extends SearchAlgorithm {
    @Override
    protected State searchAFinal(Problem p) {
        State start = p.getInitialState();
        if(p.isFinal(start)){
            return start;
        }
        ArrayList<State> openList /*f*/ = new ArrayList<>();
        openList.add(start);
        visitedStates.add(start);

        while(!openList.isEmpty()){
            maxMemoryUsage‌ = Math.max(maxMemoryUsage‌, openList.size() + expandedStates.size());
            State s = openList.remove(0);
            expandedStates.add(s);
            for(Action a : s.actionList()){
                State ns = a.nextState;
                if(cantBeAdded(ns, openList))
                    continue;
                visitedStates.add(ns);
                if(p.isFinal(ns)){
                    return ns;
                }
                openList.add(0, ns);
            }
        }
        return null;
    }
}