import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxcounter = 0;
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(array[i] == max) {
                maxcounter++;
            }
        }
        System.out.println(max + " " + maxcounter);
        in.close();
    }
}