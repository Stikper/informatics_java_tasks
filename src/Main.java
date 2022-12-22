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
        int r = in.nextInt();
        //Проерка условия
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sign_counter = 0;
                int sum = 0;
                while (matrix[i][j] > 0) {
                    sum += matrix[i][j] % 10;
                    matrix[i][j] /= 10;
                    sign_counter++;
                }
                if (sign_counter == k && sum % r == 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        in.close();
    }
}