package graphs.maze_shortest;

//www.apluscompsci.com
//Name -

import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class MazeQNew
{
    private char[][] maze;
    private int steps;
    private TreeMap<String, TreeSet<String>> map;

    public MazeQNew()
    {
        steps = -1;
        maze = new char[0][0];
    }

    public MazeQNew(char[][] m)
    {
        steps = -1;
        maze = new char[m.length][m[0].length];
        for(int r= 0; r<maze.length; r++)
        {
            for(int c =0; c<maze[r].length; c++)
            {
                maze[r][c]=m[r][c];
            }
        }

        map = new TreeMap<>();
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++){
                String curr = i + "," + j;
                if (map.get(curr) == null){
                    map.put(curr, new TreeSet<>());
                }

                TreeSet currSet = map.get(curr);
                if (i - 1 >= 0){
                    if (maze[i-1][j] == '.'){
                        currSet.add((i-1) + "," + j);
                    }
                }
                if (j - 1 >= 0){
                    if (maze[i][j-1] == '.'){
                        currSet.add(i + "," + (j-1));
                    }
                }
                if (i + 1 < maze.length){
                    if (maze[i+1][j] == '.'){
                        currSet.add((i+1) + "," + j);
                    }
                }
                if (j + 1 < maze[i].length){
                    if (maze[i][j+1] == '.'){
                        currSet.add(i + "," + (j+1));
                    }
                }

                map.put(curr, currSet);
            }
        }
    }

    public void checkForExitPath(int rr, int cc)
    {
        steps = -1;

        if (maze[rr][cc] != '.' || maze[maze.length - 1][maze[0].length - 1] != '.'){
            return; // start or exit is not possible
        }

        Queue<String> q = new LinkedList<String>();
        LinkedList<String> v = new LinkedList<String>();
        Map<String, Integer> distance = new HashMap<>();

        String start = rr + "," + cc;
        q.add(start);
        v.add(start);
        distance.put(start,0);

        while (!q.isEmpty()){
            String current = q.poll();
            int dist = distance.get(current);
            TreeSet set = map.get(current);

            if (current.equals((maze.length - 1) + "," + (maze[0].length - 1))){
                steps = dist;
                return;
            }

            for (Object neighbor : set){
                if (!v.contains(neighbor)){
                    v.add((String)neighbor);
                    distance.put((String)neighbor, dist + 1);
                    q.add((String)neighbor);
                }
            }
        }

    }

    public int found()
    {
        return steps;
    }

    public String toString()
    {
        String output="";
        for(int r= 0; r<maze.length; r++)
        {
            for(int c =0; c<maze[r].length; c++)
            {
                output+=maze[r][c]+" ";
            }
            output+="\n";
        }
        return output;
    }
}
