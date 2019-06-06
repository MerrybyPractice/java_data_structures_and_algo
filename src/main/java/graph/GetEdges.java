package graph;


import hash.Hashtable;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;

public class GetEdges extends Graph {
    ArrayList<String> trackingArray;
    int price;
    int tracking;

    public Pair<Boolean, Integer> getEdges(String[] cities, Graph routes) {

        Boolean direct = directFlights(cities, routes);
        int totalPrice = price(cities[0], cities, routes);

        Pair returnValue = new Pair<>(direct, totalPrice);

        return returnValue;

    }


    private boolean directFlights(String[] cities, Graph routes) {

        boolean returnValue = true;
        ArrayList<LinkedList> routesAdjacency = routes.getAdjacencyList();

        for (String city : cities) {
            for (int c = 0; c < cities.length; c++) {
                int idx = routesAdjacency.indexOf(city);
                if (routes.getAdjacencyList().contains(idx)) {
                    if (!routesAdjacency.get(idx).contains(cities[c])) {
                        returnValue = false;
                        return returnValue;
                    }
                }
            }
        }
        return returnValue;
    }

    private int price(String city, String[] cities, Graph routes) {
        ArrayList<LinkedList> routesAdjacency = routes.getAdjacencyList();


        if (trackingArray.contains(cities)) {
            return price;
        }
        int idx = routesAdjacency.indexOf(city);
        int idx2 = tracking + 1;
        if (routesAdjacency.get(idx).contains(cities[idx2])) {
            LinkedList singleCity = routesAdjacency.get(idx);

            Hashtable.KeyValuePair edge = (Hashtable.KeyValuePair) singleCity.get(idx2);

            price += edge.intValue;
            tracking++;
        } else {
            price(cities[tracking], cities, routes);
        }
        return price;
    }

}
