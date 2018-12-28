import algorithms.*;
import problems.Problem_cities;
import problems.Problem_test;

public class Main {

    public static void main(String[] args) {
        Problem_cities problem_cities = new Problem_cities();
        SearchAlgorithm searchAlgorithm = new UniformCost().graphSearch();
        searchAlgorithm.run(problem_cities);
    }
}
