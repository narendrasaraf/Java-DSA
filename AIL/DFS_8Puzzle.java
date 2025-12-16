// package AIL;

// import java.util.*;

// public class DFS_8Puzzle {

//     static class PuzzleNode {
//         int[] state;
//         PuzzleNode parent;
//         String move;
//         String stateStr;

//         public PuzzleNode(int[] state, PuzzleNode parent, String move) {
//             this.state = state;
//             this.parent = parent;
//             this.move = move;
//             this.stateStr = Arrays.toString(state);
//         }

//         @Override
//         public boolean equals(Object o) {
//             if (this == o) return true;
//             if (o == null || getClass() != o.getClass()) return false;
//             PuzzleNode that = (PuzzleNode) o;
//             return stateStr.equals(that.stateStr);
//         }

//         @Override
//         public int hashCode() {
//             return Objects.hash(stateStr);
//         }
//     }

//     public static List<PuzzleNode> getNeighbors(PuzzleNode node) {
//         List<PuzzleNode> neighbors = new ArrayList<>();
//         int[] state = node.state;

//         int zeroIndex = -1;
//         for (int i = 0; i < state.length; i++) {
//             if (state[i] == 0) {
//                 zeroIndex = i;
//                 break;
//             }
//         }

//         int row = zeroIndex / 3;
//         int col = zeroIndex % 3;

//         int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
//         String[] moveNames = {"Up", "Down", "Left", "Right"};

//         for (int i = 0; i < moves.length; i++) {
//             int newRow = row + moves[i][0];
//             int newCol = col + moves[i][1];

//             if (newRow >= 0 && newRow < 3 && newCol >= 0 && newCol < 3) {
//                 int newIndex = newRow * 3 + newCol;

//                 int[] newState = Arrays.copyOf(state, state.length);
//                 newState[zeroIndex] = newState[newIndex];
//                 newState[newIndex] = 0;

//                 neighbors.add(new PuzzleNode(newState, node, moveNames[i]));
//             }
//         }
//         return neighbors;
//     }

//     public static void printSolution(PuzzleNode node) {
//         if (node == null) {
//             System.out.println("No solution found.");
//             return;
//         }

//         List<PuzzleNode> path = new ArrayList<>();
//         PuzzleNode current = node;
//         while (current != null) {
//             path.add(current);
//             current = current.parent;
//         }
//         Collections.reverse(path);

//         System.out.println("Solution found in " + (path.size() - 1) + " moves:");
//         for (int i = 0; i < path.size(); i++) {
//             PuzzleNode step = path.get(i);
//             if (i == 0) {
//                 System.out.println("Initial State:");
//             } else {
//                 System.out.println("\nMove " + i + ": " + step.move);
//             }
//             printBoard(step.state);
//         }
//     }

//     public static void printBoard(int[] state) {
//         for (int i = 0; i < state.length; i++) {
//             System.out.print(state[i] + " ");
//             if ((i + 1) % 3 == 0) {
//                 System.out.println();
//             }
//         }
//     }

//     public static PuzzleNode dfsSolver(int[] initialState, int[] goalState) {
//         Stack<PuzzleNode> stack = new Stack<>();
//         Set<String> visited = new HashSet<>();

//         PuzzleNode startNode = new PuzzleNode(initialState, null, null);
//         stack.push(startNode);
//         visited.add(startNode.stateStr);

//         String goalStateStr = Arrays.toString(goalState);

//         while (!stack.isEmpty()) {
//             PuzzleNode currentNode = stack.pop();

//             if (currentNode.stateStr.equals(goalStateStr)) {
//                 return currentNode;
//             }

//             List<PuzzleNode> neighbors = getNeighbors(currentNode);
//             Collections.reverse(neighbors); 
            
//             for (PuzzleNode neighbor : neighbors) {
//                 if (!visited.contains(neighbor.stateStr)) {
//                     visited.add(neighbor.stateStr);
//                     stack.push(neighbor);
//                 }
//             }
//         }
//         return null;
//     }

//     public static void main(String[] args) {
//         // This is a new, SOLVABLE initial state that is 2 moves away from the goal.
//         int[] initialState = {1, 2, 3, 4, 0, 6, 7, 5, 8};
//         int[] goalState = {1, 2, 3, 4, 5, 6, 7, 8, 0};

//         System.out.println("Solving 8-Puzzle with DFS...");
//         System.out.println("Initial State:");
//         printBoard(initialState);
//         System.out.println("\nGoal State:");
//         printBoard(goalState);
//         System.out.println("\n--------------------------\n");

//         long startTime = System.currentTimeMillis();
//         PuzzleNode solutionNode = dfsSolver(initialState, goalState);
//         long endTime = System.currentTimeMillis();

//         printSolution(solutionNode);
        
//         System.out.println("\n--------------------------");
//         System.out.println("Time taken: " + (endTime - startTime) + " ms");
//     }
// }
