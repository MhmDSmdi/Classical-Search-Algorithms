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

    public SearchAlgorithm() {
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

    protected boolean isAddable(State s, ArrayList<State> openList){
        for(State aState: openList) {
            if (s.equals(aState))
                return false;
        }
        if(isGraphSearch){
            for(State aState : expandedStates) {
                if (s.equals(aState))
                    return false;
            }
        }
        return true;
    }

    public void run(Problem p){
        maxMemoryUsage‌ = 0;
        visitedStates.clear();
        expandedStates.clear();
        finalState = searchAFinal(p);
        if(finalState == null){
            System.err.println("Can't access to a final! :(");
        }
        printResult();
    }

    public ArrayList<String> getBestPath(){
        if(finalState == null)
            return null;
        ArrayList<String> actionStrs = new ArrayList<>();
        State s = finalState;
        while(s.getParentState() != null){
            actionStrs.add(0, s.getStateName());
            s = s.getParentState();
        }
        return actionStrs;
    }

    public int getBestCost(){
        if(finalState == null)
            return -1;
        return finalState.getG_state();
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
    protected abstract State searchAFinal(Problem p);

    public void printResult() {
        System.out.println("Visited states number: " + visitedStates.size());
        System.out.println("Expanded states number: " + expandedStates.size());
        System.out.println("Best path: " + getBestPath());
        System.out.println("Best path cost: " + getBestCost());
        System.out.println("Max memory usage (states number): " + maxMemoryUsage‌ );
        System.out.println("Final state: [" + finalState + "]");
    }
}
