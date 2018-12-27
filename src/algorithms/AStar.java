package algorithms;

import graph.Action;
import graph.State;
import problems.Problem;

import java.util.ArrayList;

public class AStar extends SearchAlgorithm {

    @Override
    protected State searchAFinal(Problem p) {
        State start = p.getInitialState();
        if(p.isFinal(start)){
            return start;
        }
        ArrayList<State> openList = new ArrayList<>();
        openList.add(start);
        visitedStates.add(start);

        while(!openList.isEmpty()){
            maxMemoryUsage‌ = Math.max(maxMemoryUsage‌, openList.size() + expandedStates.size());
            State s = getBestState(openList, p);
            openList.remove(s);
            if(p.isFinal(s)){
                return s;
            }
            expandedStates.add(s);
            for(Action a : s.actionList()){
                State ns = a.nextState;
                if(cantBeAdded(ns, openList))
                    continue;
                visitedStates.add(ns);
                openList.add(ns);
            }
        }
        return null;
    }

    private State getBestState(ArrayList<State> openList, Problem p){
        int minLoad = Integer.MAX_VALUE;
        State bestState = null;
        for(State s: openList){
            int sDotLoad = s.g_state + p.hCost(s);
            if(sDotLoad < minLoad){
                minLoad = sDotLoad;
                bestState = s;
            }
        }
        return bestState;
    }

}