import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        // Чтение
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        //Сортировка
        SelectionSort(array, 0);
        // Вывод
        for (int now : array) {
            System.out.print(now + " ");
        }
     }
    //Функция сравнения (возвращает true если первый аргумент превосходит второй, иначе возвращает false)
    public static boolean cmp(int a, int b) {
        return a > b;
    }
    //Функция меняющая два элемента массива (шоб меньше писать в функции сортировки :) )
    //Э - Эфективность
    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    //Сортировка выбором ебать (с костылем для четности/нечетности)
    public static void SelectionSort(int[] array, int odd) {
        int n = array.length;
        for (int i = odd; i < n - 2; i += 2) {
            //Выборы выборы
            int num_min = i;
            for (int j = i; j < n; j += 2) {
                //Кандидиаты пидоры
                if (array[j] < array[num_min]) {
                    num_min = j;
                }
            }
            if (array[i] != array[num_min]) {
                swap(array, i, num_min);
            }
        }
    }
}