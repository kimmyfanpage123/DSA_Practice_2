package graphs.maze_dragon;
import number_systems.ASCII_to_binary.ConvertRunner;
import java.util.*;

public class MazeDragon {
    private static class CoordinatePair implements Comparable{
        List<Integer> pair;
        int distance;

        CoordinatePair(int r, int c, int currDistance){
            pair = new ArrayList<>();
            pair.add(r);
            pair.add(c);
            distance = currDistance + 1;
        }
        @Override
        public int compareTo(Object o){
            CoordinatePair other = (CoordinatePair) o;
            if (Objects.equals(other.pair.get(0), this.pair.get(0)) && Objects.equals(other.pair.get(1), this.pair.get(1))){
                return 0;
            }
            return -1;
        }
        @Override
        public int hashCode(){
            return getR() * 1000 + getC();
        }
        @Override
        public boolean equals(Object o){
            CoordinatePair other = (CoordinatePair) o;
            return (Objects.equals(other.pair.get(0), this.pair.get(0)) && Objects.equals(other.pair.get(1), this.pair.get(1)));
        }
        public int getR(){
            return pair.get(0);
        }
        public int getC(){
            return pair.get(1);
        }
        public int getDistance(){
            return distance;
        }
        public String toString(){
            return pair.toString();
        }
    }
    Set<Character> monsterChars = new TreeSet<>();

    private char[][] maze;
    private boolean exitFound;
    private int shortestDistance;

    private Queue<CoordinatePair> queue;
    private HashSet<CoordinatePair> visited;

    public MazeDragon(){
        exitFound = false;
        maze = new char[0][0];
    }
    public MazeDragon(char[][] m){
        exitFound = false;
        maze = new char[m.length][m[0].length];
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++){
                maze[i][j] = m[i][j];
            }
        }
        queue = new LinkedList<>();
        visited = new HashSet<>();
        shortestDistance = -1;

        Collections.addAll(monsterChars, 'S','Z','E','L','C','F');
    }

    private int[][] generateValidneighbors(int r, int c){
        int [][] neighbors;
        neighbors = new int[][]
                {{r-1,c}, {r+1,c}, {r,c-1},{r,c+1}};
        for (int i = 0; i < 4; i++){
            int rN = neighbors[i][0];
            int cN = neighbors[i][1];

            if (!(rN >= 0 && rN < maze.length) || !(cN >= 0 && cN < maze[0].length) || !(maze[rN][cN] == '.' || maze[rN][cN] == 'P')){
                neighbors[i] = new int[]{-1,-1};
            }
        }
        return neighbors;
    }

    private ArrayList<CoordinatePair> generateValidSpace(int rN, int cN, int depth){
        ArrayList<CoordinatePair> ret = new ArrayList<>();
        for (int r = rN - depth; r < rN + depth+1; r++){
            for (int c = cN - depth; c < cN + depth+1; c++){
                if ((r >= 0 && r < maze.length) && (c >= 0 && c < maze[0].length)){
                    ret.add(new CoordinatePair(r, c, -1));
                }
            }
        }
        return ret;
    }

    public boolean findDangerousTiles(){
        boolean portalFound = false;
        for (int r = 0; r < maze.length; r++){
            for (int c = 0; c < maze[1].length; c++){
                char block = maze[r][c];
                if (block == 'P'){
                    portalFound = true;
                }

                if (monsterChars.contains(block)){
                    visited.addAll(generateValidSpace(r,c,1));
                }
                else if (block == 'R' || block == 'K'){
                    visited.addAll(generateValidSpace(r,c,3));
                }
            }
        }
        return portalFound;
    }

    public CoordinatePair findSteve(){
        for (int r = 0; r < maze.length; r++){
            for (int c = 0; c < maze[0].length; c++){
                if (maze[r][c] == 'T'){
                    return new CoordinatePair(r,c,0);
                }
            }
        }
        return new CoordinatePair(0,0,0);
    }

    public void checkForExitPath(){
        if (!findDangerousTiles()){
            exitFound = false;
        }
        else{
            CoordinatePair stevePos = findSteve();

            checkForExitPath(stevePos.getR(), stevePos.getC());
        }
    }

    public void checkForExitPath(int rr, int cc){
        queue.add(new CoordinatePair(rr, cc, 0));

        while (!queue.isEmpty()){
            CoordinatePair curr = queue.poll();
            int r = curr.getR();
            int c = curr.getC();

            if (maze[r][c] == 'P'){
                exitFound = true;
                shortestDistance = curr.distance - 1;
                return;
            }
            int [][] neighbors = generateValidneighbors(r,c);

            for (int i = 0; i < neighbors.length; i++){
                CoordinatePair temp = new CoordinatePair(neighbors[i][0],neighbors[i][1], curr.getDistance());
                if (neighbors[i][0] != -1 && !visited.contains(temp)){
                    queue.add(temp);
                    visited.add(temp);
                }
            }
            if (queue.isEmpty()){
                exitFound = false;
                return;
            }
        }
    }

    public boolean found(){
        return exitFound;
    }
    public int getShortestDistance(){
        return shortestDistance;
    }

    public String toString(){
        String output = "";
        for (int r = 0; r < maze.length; r++){
            for (int c = 0; c < maze[r].length; c++){
                output += maze[r][c] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
