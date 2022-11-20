import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int first = Integer.MAX_VALUE;
        int fcount = 1;
        int second = Integer.MAX_VALUE;
        int scount = 1;
        int third = Integer.MAX_VALUE;
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(array[i] < first) {
                fcount = 1;
                first = array[i];
            }
            if(array[i] == first) {
                fcount++;
            }
        }
        for(int i = 0; i < n; i++) {
            if(array[i] < second && array[i] != first) {
                scount = 1;
                second = array[i];
            }
            if(array[i] == second) {
                scount++;
            }
        }
        for(int i = 0; i < n; i++) {
            if(array[i] < third && array[i] != second && array[i] != first) {
                third = array[i];
            }
        }
        for(int i = 0; i < 3; i++) {
            if(fcount != 0) {
                System.out.println(first + " ");
                fcount--;
            } else if(scount != 0) {
                System.out.println(second + " ");
                scount--;
            } else {
                System.out.println(third);
            }
        }
        in.close();
    }
}