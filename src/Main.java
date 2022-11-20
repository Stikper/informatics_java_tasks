import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max_number;
        int counter = 1;
        int max_counter = 1;
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        max_number = array[0];
        for(int i = 0; i < n - 1; i++) {
            if(array[i] == array[i + 1]) {
                counter++;
                if(counter > max_counter) {
                    max_counter = counter;
                    max_number = array[i];
                }
            } else {
                counter = 1;
            }
        }
        System.out.println(max_number + " " + max_counter);
        in.close();
    }
}