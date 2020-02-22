package troj;


public class PascalTriangle {


    static long silnia(long x) {
        long output = 1;
        for (int i = 1; i <= x; i++) {
            output *= i;
        }
        return output;
    }


    public static void main(String[] args) {
        int size = 20;
        int n = 1;
        int a = 1;
        int b = 1;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(silnia(i) / (silnia(j)*silnia(i-j))+" ");

            }
            n+=1;
            System.out.println();

        }


    }
}

