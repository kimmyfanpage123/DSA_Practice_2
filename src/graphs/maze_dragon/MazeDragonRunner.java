package graphs.maze_dragon;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeDragonRunner {
    public static void main(String args[]) throws IOException{
        Scanner file = new Scanner(new File("C:/Users/559595/IdeaProjects/DSA_Practice_2/src/graphs/maze_dragon/stronghold.dat"));
        int numEntries = file.nextInt();
        file.nextLine();
        for (int i = 0; i < numEntries; i++){
            int rN = file.nextInt();
            int cN = file.nextInt();
            char[][] maze = new char[rN][cN];
            file.nextLine();

            for (int r = 0; r < rN; r++){
                char[] line = file.next().toCharArray();
                for (int c = 0; c < cN; c++){
                    maze[r][c] = line[c];
                }
                file.nextLine();
            }
            MazeDragon test = new MazeDragon(maze);
            /*System.out.println(test);
            test.checkForExitPath();
            System.out.println(test.found() + "\nshortest distance: " + test.getShortestDistance() + "\n");

             */
            test.checkForExitPath();
            if (test.found()){
                System.out.println(test.getShortestDistance());
            }
            else{
                System.out.println("You can't afford, ford ford, my diamond sword, sword, sword");
            }
        }
    }
}
