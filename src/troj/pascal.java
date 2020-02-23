package troj;

public class pascal {
    public static void printPascal(int n)
    {
        for(int line = 1; line <= n; line++)
        {

            int p=1;// used to represent C(line, i)
            for(int i = 1; i <= line; i++)
            {
                // The first value in a line is always 1
                System.out.print(p+" ");
                p = p * (line - i) / i;
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args) {
        int n = 15;
        printPascal(n);
    }
}

