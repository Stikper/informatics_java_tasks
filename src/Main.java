import java.util.Scanner;

//import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = Integer.MAX_VALUE;
        int imin = 0;
        int[][] matrix = new int[n][m];
        //Чтение
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
                sum += matrix[i][j];
            }
            if (sum < min) {
                min = sum;
                imin = i;
            }
        }
        //Вывод
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[imin][j] + " ");
        }
        in.close();
    }
}