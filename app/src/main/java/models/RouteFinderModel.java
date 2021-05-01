package models;

import java.util.List;
import java.util.Set;

/**
 * This class defines a model for
 */
public class RouteFinderModel {
    /**
     * Returns the shortest path between start and any of the places in ends
     * @param start Place we start the path from
     * @param ends Places we want to end the path at
     * @param wheelchair True if the path needs to be wheelchair accessible
     * @param stairs True if the path can have stairs
     * @return A list of places that we will visit on this path, or an empty list if a valid path
     * doesn't exist
     */
    public List<Place> shortestPath(Place start, Set<Place> ends, boolean wheelchair,
                                    boolean stairs) {
        return null;
    }

    /**
     * This private method defines the heuristic function for the A* search algorithm
     * @param currPlace the place we want to get the heuristic value of
     * @param ends entrances of the building we want to estimate the distance to
     * @return estimated distance between currPlace and the closest end
     */
    private float heuristic(Place currPlace, Set<Place> ends) {
        return 0;
    }
}
