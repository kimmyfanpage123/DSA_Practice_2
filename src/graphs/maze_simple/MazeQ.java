package graphs.maze_simple;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class MazeQ
{
   private char[][] maze;
   private boolean exitFound;
   private TreeMap<String, TreeSet<String>> map;

	public MazeQ()
	{
		exitFound = false;
		maze = new char[0][0];
	}
	
	public MazeQ(char[][] m)
	{
		exitFound=false;
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
		Queue<String> q = new LinkedList<String>();
		LinkedList<String> v = new LinkedList<String>();

		q.add(rr + "," + cc);
		
		while (!q.isEmpty()){
			String current = q.poll();

			TreeSet set = map.get(current);

			for (Object neighbor : set){
				if (!v.contains(neighbor)){
					v.add(((String) neighbor));
					String[] idk = ((String) neighbor).split(",");
					int r = Integer.parseInt(idk[0]);
					int c = Integer.parseInt(idk[1]);
					if (r == maze.length - 1 && c == maze[0].length - 1 && maze[maze.length - 1][maze[0].length - 1] == '.'){
						exitFound = true;
						return;
					}
					q.add((String) neighbor);
				}
			}
		}

	}
	
	public boolean found()
	{
		return exitFound;
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