import algorithms.BFS;
import algorithms.DFS;
import algorithms.SearchAlgorithm;
import problems.Problem1;

public class Main {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        SearchAlgorithm searchAlgorithm = new DFS();
        searchAlgorithm.run(problem1);
    }
}
