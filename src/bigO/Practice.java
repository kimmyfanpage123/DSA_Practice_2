package bigO;

public class Practice {// Java program to illustrate time
    // complexity for single for-loop
    class GFG
    {
/*
        // Driver Code
        public static void main(String[] args)
        {
            int a = 0, b = 0;
            int N = 4, M = 4;

            // This loop runs for N time
            for (int i = 0; i < N; i++)
            {
                a = a + 10;
            }

            // This loop runs for M time
            for (int i = 0; i < M; i++)
            {
                b = b + 40;
            }
            System.out.print(a + " " + b);
        }
    }

// This code is contributed by rutvik_56*/
/*
        public static void main (String[] args)
        {
            int a = 0;
            int b = 0;
            int N = 4;
            int M = 5;

            // Nested loops
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    a = a + j;

                    // Print the current
                    // value of a
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }
    }*/

        // Driver Code
        public static void main (String[] args)
        {
            int a = 0;
            int b = 0;
            int N = 4;
            int M = 5;

            // Nested loops
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    a = a + j;

                    // Print the current
                    // value of a
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }
    }
    // Driver Code
    public static void main (String[] args)
    {
        int N = 8, k = 0;

        // First loop run N/2 times
        for (int i = N / 2; i <= N; i++) {

            // Inner loop run log N
            // times for all i
            for (int j = 2; j <= N;
                 j = j * 2) {

                // Print the value k
                System.out.print(k + " ");

                k = k + N / 2;
            }
        }

    }

// This code is contributed by Shubham Singh

                //O(10000n^2 + 5n + 8) becomes O(n^2)


}
