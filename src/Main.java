import algorithms.DLS;
import algorithms.SearchAlgorithm;
import problems.Problem_test;

public class Main {

    public static void main(String[] args) {
        Problem_test problemTest = new Problem_test();
        SearchAlgorithm searchAlgorithm = new DLS(3);
        searchAlgorithm.run(problemTest);
    }
}
