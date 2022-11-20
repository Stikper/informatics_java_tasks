import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int counter = 0;
        int[] array = new int[n];
        //Заполнение массива рандомными числами от a до b
        for (int i = 0; i < n; i++) {
            array[i] = (int) (random() * (b - a + 1)) + a;
        }
        for(int i : array) {
            //Вывод i-ого элемента массива
            System.out.print(i + " ");
            //Подсчет суммы i-ого элемента массива
            int sum = 0;
            while(i != 0) {
                sum += i % 10;
                i /= 10;
            }
            //Сравнение суммы i-ого элемента c заданной суммой
            if(k == sum) {
                counter++;
            }
        }
        System.out.println();
        System.out.print(counter);
    }

}