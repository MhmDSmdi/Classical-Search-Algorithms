package problems;

import graph.Action;
import graph.State;

public class Problem_cities extends Problem {

    public Problem_cities() {
        setupProblem();
    }

    @Override
    public void setupProblem() {
        State arad = new State("Arad", 366);
        initialState = arad;
        State bucharest = new State("bucharest", 0);
        finalStates.add(bucharest);
        State craiova = new State("craiova", 160);
        State dobreta = new State("dobreta", 242);
        State eforie = new State("eforie", 161);
        State fagaras = new State("fagaras", 178);
        State giurgiu = new State("giurgiu", 77);
        State hirsova = new State("hirsova", 151);
        State iasi = new State("iasi", 226);
        State lugoj = new State("lugoj", 244);
        State mehadia = new State("mehadia", 241);
        State neamt = new State("neamt", 234);
        State oradea = new State("oradea", 380);
        State pitesti = new State("pitesti", 98);
        State rimnicu_vilcea = new State("rimnicu_vilcea", 193);
        State sibiu = new State("sibiu", 253);
        State timisoara = new State("timisoara", 329);
        State urziceni = new State("urziceni", 80);
        State vaslui = new State("vaslui", 199);
        State zerind = new State("zerind", 374);

        oradea.addAction(new Action(zerind, 71));
        oradea.addAction(new Action(sibiu, 151));

        zerind.addAction(new Action(arad, 75));
        zerind.addAction(new Action(oradea, 71));

        arad.addAction(new Action(sibiu, 140));
        arad.addAction(new Action(zerind, 75));
        arad.addAction(new Action(timisoara, 118));

        sibiu.addAction(new Action(fagaras, 99));
        sibiu.addAction(new Action(rimnicu_vilcea, 80));
        sibiu.addAction(new Action(oradea, 151));
        sibiu.addAction(new Action(arad, 140));

        timisoara.addAction(new Action(lugoj, 111));
        timisoara.addAction(new Action(arad, 118));

        lugoj.addAction(new Action(mehadia, 70));
        lugoj.addAction(new Action(timisoara, 111));

        mehadia.addAction(new Action(dobreta, 75));
        mehadia.addAction(new Action(lugoj, 70));

        dobreta.addAction(new Action(craiova, 120));
        dobreta.addAction(new Action(mehadia, 75));

        craiova.addAction(new Action(dobreta, 120));
        craiova.addAction(new Action(pitesti, 138));
        craiova.addAction(new Action(rimnicu_vilcea, 146));

        rimnicu_vilcea.addAction(new Action(craiova, 120));
        rimnicu_vilcea.addAction(new Action(pitesti, 98));
        rimnicu_vilcea.addAction(new Action(sibiu, 80));

        fagaras.addAction(new Action(sibiu, 99));
        fagaras.addAction(new Action(bucharest, 211));

        pitesti.addAction(new Action(rimnicu_vilcea, 97));
        pitesti.addAction(new Action(bucharest, 101));
        pitesti.addAction(new Action(craiova, 138));

        bucharest.addAction(new Action(fagaras, 211));
        bucharest.addAction(new Action(pitesti, 101));
        bucharest.addAction(new Action(urziceni, 85));
        bucharest.addAction(new Action(giurgiu, 90));

        giurgiu.addAction(new Action(bucharest, 90));

        urziceni.addAction(new Action(bucharest, 85));
        urziceni.addAction(new Action(hirsova, 98));
        urziceni.addAction(new Action(vaslui, 142));

        hirsova.addAction(new Action(urziceni, 98));
        hirsova.addAction(new Action(eforie, 86));

        eforie.addAction(new Action(hirsova, 86));

        vaslui.addAction(new Action(urziceni, 142));
        vaslui.addAction(new Action(iasi, 92));

        iasi.addAction(new Action(vaslui, 92));
        iasi.addAction(new Action(neamt, 87));

        neamt.addAction(new Action(iasi, 87));









    }

}
