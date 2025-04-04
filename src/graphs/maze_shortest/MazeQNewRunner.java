package graphs.maze_shortest;
//www.apluscompsci.com
//Name -

import graphs.maze_simple.MazeQ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeQNewRunner
{
    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/graphs/maze_shortest/maze_short.dat"));
        while(file.hasNext())
        {
            int rc = file.nextInt();
            char[][] maze = new char[rc][rc];
            file.nextLine();

            for(int r= 0; r < rc; r++)
            {
                char[] ln = file.next().toCharArray();
                //System.out.println(ln);
                for(int c =0; c < rc; c++)
                {
                    maze[r][c]=ln[c];
                }
                //file.nextLine();
            }

            MazeQNew test = new MazeQNew(maze);

            System.out.println( test );

            test.checkForExitPath(0,0);

            if (test.found() == -1){
                System.out.println("no exit found" + "\n");
            }
            else{
                System.out.println( test.found() + " steps " + "\n" );
            }
        }
    }
}
