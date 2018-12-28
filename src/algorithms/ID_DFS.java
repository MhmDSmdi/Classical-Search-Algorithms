package algorithms;

import graph.Action;
import graph.State;
import problems.Problem;

import java.util.ArrayList;


public class ID_DFS extends SearchAlgorithm {

    public ID_DFS() {
        algorithmName = "IDDFS Search Algorithm";
    }

    @Override
    protected State searchAFinal(Problem p) {
        State start = p.getInitialState();
        if(p.isFinal(start)){
            return start;
        }
        ArrayList<State> openList = new ArrayList<>();
        State lastState = null, currentState;
        for(int depthLimit = 0; ; depthLimit++) {
            openList.clear();
            openList.add(start);
            visitedStates.add(start);
            currentState = start;
            while (!openList.isEmpty()) {
                maxMemoryUsage‌ = Math.max(maxMemoryUsage‌, openList.size() + expandedStates.size());
                State s = openList.remove(0);
                if (s.getStep_from_root() >= depthLimit) continue;
                expandedStates.add(s);
                for (Action a : s.getActions()) {
                    State ns = a.getNextState();
                    ns.setParentState(s);
                    if (isAddable(ns, openList)) {
                        visitedStates.add(ns);
                        if (p.isFinal(ns)) {
                            return ns;
                        }
                        openList.add(0, ns);
                        currentState = ns;
                    }
                }
            }
            if(currentState == lastState)
                return null;
            else{
                lastState = currentState;
            }
        }
    }
}
