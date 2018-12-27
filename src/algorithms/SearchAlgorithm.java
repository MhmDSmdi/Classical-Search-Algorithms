package algorithms;
import graph.State;
import problems.Problem;

import java.util.ArrayList;
import java.util.HashSet;
public abstract class SearchAlgorithm {

    private State finalState;
    protected int maxMemoryUsage‌;
    protected boolean isGraphSearch;
    protected HashSet<State> visitedStates, expandedStates;

    SearchAlgorithm() {
        visitedStates = new HashSet<>();
        expandedStates = new HashSet<>();
        isGraphSearch = true;
    }

    public SearchAlgorithm graphSearch() {
        isGraphSearch = true;
        return this;
    }
    public SearchAlgorithm treeSearch() {
        isGraphSearch = false;
        return this;
    }

    protected boolean cantBeAdded(State s, ArrayList<State> openList){
        for(State aState: openList) {
            if (s.equals(aState))
                return true;
        }
        if(isGraphSearch){
            for(State aState : expandedStates) {
                if (s.equals(aState))
                    return true;
            }
        }
        return false;
    }

    protected abstract State searchAFinal(Problem p);

    public void run(Problem p){
        maxMemoryUsage‌ = 0;
        visitedStates.clear();
        expandedStates.clear();
        finalState = searchAFinal(p);
        if(finalState == null){
            System.err.println("Can't access to a final! :(");
        }
    }


    public ArrayList<String> getBestPath(){
        if(finalState == null)
            return null;
        ArrayList<String> actionStrs = new ArrayList<>();
        State s = finalState;
        while(s.parent != null){
            actionStrs.add(0, s.actionStr);
            s = s.parent;
        }
        return actionStrs;
    }

    public int getBestCost(){
        if(finalState == null)
            return -1;
        return finalState.g_state;
    }

    public State getFinal(){
        return finalState;
    }
    public int getMaxMemoryUsage‌(){
        return maxMemoryUsage‌;
    }
    public int visitedStatesNumber(){
        return visitedStates.size();
    }
    public int expandedStatesNumber(){
        return expandedStates.size();
    }
}
