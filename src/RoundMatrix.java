public class RoundMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrixClockWisely(a, 4, 4);
    }

    public static void printMatrixClockWisely(int [][] a, int columns, int rows) {
        if (a== null || columns == 0 || rows == 0) {
            return;
        }

        int start = 0;
        while (columns > start*2 && rows > start*2) {
            printMatrixCircle(a, columns, rows, start);
            start++;
        }
    }

    public static void printMatrixCircle(int [][] a, int columns, int rows, int start) {
        int endX = columns - start - 1;
        int endY = rows - start - 1;
        //l---->r
        for (int i = start; i<=endX; i++) {
            int num = a[start][i];
            System.out.println(num);
        }

        for(int i = start+1;i<=endY; i++)
            System.out.println(a[i][endX]);
        //剩下不止一行时
        if (start < endX && start<endY) {
            for (int i = endX - 1; i>=start; i--)
                System.out.println(a[endY][i]);
        }

        if (start<endX && start<endY-1) {
            for (int i = endY - 1; i>=start+1; i--)
                System.out.println(a[i][start]);
        }

    }
}
