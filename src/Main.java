import java.util.Scanner;

//import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int counter = 0;
        int[][] matrix = new int[n][m];
        //Чтение
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();
        //Проерка условия
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == k) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        in.close();
    }
}