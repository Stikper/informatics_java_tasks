import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        // Чтение массива
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        BubbleSort(array);

        //Вывод массива
        for (int now : array) {
            System.out.print(now + " ");
        }
    }


    //Функция сравнения (возвращает true если первый аргумент превосходит второй, иначе возвращает false)
    public static boolean cmp(int a, int b) {
        return a % 10 > b % 10; // Сравнение последних чисел
    }

    //Функция меняющая два элемента массива (шоб меньше писать в функции сортировки :) )
    //Э - Эфективность
    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    //Сортировка пузыриком ебать
    public static void BubbleSort(int[] array) {
        // Буль буль буль буль буль
        for (int i = 0; i + 1 < array.length; i++) {
            // Буль буль буль буль буль
            for (int j = 0; j + 1 < array.length - i; j++) {
                // Буль буль буль буль буль
                if(cmp(array[j], array[j + 1])) {
                    // Буль буль буль буль буль
                    swap(array, j, j + 1);
                    // Буль буль буль буль буль
                }
            }
        }
    }

}