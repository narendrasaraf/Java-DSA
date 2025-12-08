import java.util.*;

public class GraphColoringFC {

    // Graph represented as adjacency list
    static Map<String, List<String>> graph = new HashMap<>();
    static List<String> colors = Arrays.asList("Red", "Green", "Blue");

    // Function to check if assigning color is valid
    static boolean isValid(String node, String color, Map<String, String> assignment) {
        for (String neighbor : graph.get(node)) {
            if (assignment.containsKey(neighbor) && assignment.get(neighbor).equals(color)) {
                return false;
            }
        }
        return true;
    }

    // Forward checking: prune color domains of neighbors
    static Map<String, List<String>> forwardCheck(Map<String, List<String>> domains, String node, String color) {
        Map<String, List<String>> newDomains = new HashMap<>();
        for (String v : domains.keySet()) {
            newDomains.put(v, new ArrayList<>(domains.get(v)));
        }

        for (String neighbor : graph.get(node)) {
            if (newDomains.get(neighbor).contains(color)) {
                newDomains.get(neighbor).remove(color);
                if (newDomains.get(neighbor).isEmpty()) {
                    return null; // domain wipeout
                }
            }
        }
        return newDomains;
    }

    // Degree heuristic: choose unassigned node with most neighbors
    static String selectUnassignedVariable(Map<String, String> assignment, Map<String, List<String>> domains) {
        List<String> unassigned = new ArrayList<>();
        for (String v : graph.keySet()) {
            if (!assignment.containsKey(v)) {
                unassigned.add(v);
            }
        }

        // choose node with highest degree
        return Collections.max(unassigned, Comparator.comparingInt(v -> graph.get(v).size()));
    }

    // Recursive Backtracking with Forward Checking
    static Map<String, String> backtrack(Map<String, String> assignment, Map<String, List<String>> domains) {
        if (assignment.size() == graph.size()) {
            return assignment; // solution found
        }

        String node = selectUnassignedVariable(assignment, domains);

        for (String color : domains.get(node)) {
            if (isValid(node, color, assignment)) {
                assignment.put(node, color);
                Map<String, List<String>> newDomains = forwardCheck(domains, node, color);

                if (newDomains != null) {
                    Map<String, String> result = backtrack(assignment, newDomains);
                    if (result != null) {
                        return result;
                    }
                }

                assignment.remove(node); // backtrack
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Create graph (can be modified)
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "D"));
        graph.put("D", Arrays.asList("B", "C"));

        // Initial domains - all nodes can take any color
        Map<String, List<String>> domains = new HashMap<>();
        for (String v : graph.keySet()) {
            domains.put(v, new ArrayList<>(colors));
        }

        Map<String, String> assignment = new HashMap<>();
        Map<String, String> solution = backtrack(assignment, domains);

        if (solution != null)
            System.out.println("Solution: " + solution);
        else
            System.out.println("No solution found!");
    }
}
