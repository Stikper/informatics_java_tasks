import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 2) {
            int[] array = new int[n];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i < n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(array[i] + " ");
            }
        } else if (n == 1) {
            System.out.println(1);
        }
        in.close();
    }
}