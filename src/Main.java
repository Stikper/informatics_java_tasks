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

        // Какой-то подозрительный намек на сортировку вставками
        for (int i = 0; i < 3; i++) {
            int num_min = i;
            for (int j = i; j < array.length; j++) {
                if (array[num_min] > array[j]) {
                    num_min = j;
                }
            }
            //Мы нашли минимум и ставим его первым сдвигом вправо от i до этого минимума
            fromToRightShift(array, i, num_min, 1);
        }

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

    // Украденные функции с предыдущего ДЗ
    public static void fromToReverse(int[] array, int fromIndex, int toIndex) {
        int tmp;
        for(int i = fromIndex; i <= fromIndex + (toIndex - fromIndex) / 2; i++) {
            tmp = array[i]; //Записываем значение ячейки массива индекса i во временную перменную
            array[i] = array[fromIndex + (toIndex - i)]; //Приравниваем ячейку массива в i к противоположной в области реверсирования
            array[fromIndex + (toIndex - i)] = tmp; //Приравниваем противоположную ячейку к временной перменной
        }
    }

    public static void fromToRightShift(int[] array, int fromIndex, int toIndex, int amount) {
        fromToLeftShift(array,fromIndex,toIndex,(toIndex - fromIndex + 1) - amount % (toIndex - fromIndex + 1));
    }

    public static void fromToLeftShift(int[] array, int fromIndex, int toIndex, int amount) {
        //Делаем как нас учили на уроке :)
        amount = amount % (toIndex - fromIndex + 1);
        if(amount == 0) {
            return; //Костыль, чтоб не сдвигать если сдвиг приводит к тому же ( там просто ниче не работает если 0 :) )
        }
        fromToReverse(array,fromIndex, fromIndex + amount - 1); //Магия
        fromToReverse(array,fromIndex + amount, toIndex); //Магия
        fromToReverse(array,fromIndex,toIndex);
    }
}