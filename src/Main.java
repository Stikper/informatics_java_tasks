import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        while (n > 1) {
            n = (int) ceil((double) n / 2);
            counter++;
        }
        System.out.println(counter);
    }
}