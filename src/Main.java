import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        //Заполнение массива вводимыми числами
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        /* Идет медведь по массиву, видит число какое-то отличное от нуля...
            пробегает от текущего индекса до конца и все такие числа заменяет на ноль (кроме этого)
            возвращается на базу, и идет дальше (смотри первую строку комментария)
         */
        for (int i = 0; i < array.length;i++) {
            if (array[i] != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        if(array[i] == array[j]) {
                            array[j] = 0;
                        }
                    }
                }
            }
        }
         /* Идет медведь по массиву, видит число какое-то равное нулю...
            "ХУЯСЕ!" -- думает медеведь и смотрит вперед, считая количество подряд идущих нулей
            от этой точки, ну вот он посчитал, и как въебал по этим нулям поганым,
            так что они нахуй в конец массива упиздили, а оставшиеся числа от ахуения
            заполнили пропуски,
            ну и попиздил медведь дальше...
         */
        for (int i = 0; i < array.length;i++) {
            if(array[i] == 0) {
                int consecutive_zero_counter = 1;
                for(int j = i+1; j < array.length; j++) {
                    if(array[j] == 0) {
                        consecutive_zero_counter++;
                    } else {
                        break;
                    }
                }
                fromToLeftShift(array, i, array.length - 1,consecutive_zero_counter);
            }
        }
        // Идет медведь по массиву, и орет на весь лес каждое число в нем
        for (int i : array) {
            System.out.print(i + " ");
        }
        // //Дошел медведь до конца, видит -- машина горит, сел в машину и сгорел...
        //Бля, мне аж грустно на момент написания, я так долго выстраивал его сюжетную линию...
        //кароч закомментирую комментарий про машину :)
    }
    public static void fromToReverse(int[] array, int fromIndex, int toIndex) {
        int tmp;
        for(int i = fromIndex; i <= fromIndex + (toIndex - fromIndex) / 2; i++) {
            tmp = array[i]; //Записываем значение ячейки массива индекса i во временную перменную
            array[i] = array[fromIndex + (toIndex - i)]; //Приравниваем ячейку массива в i к противоположной в области реверсирования
            array[fromIndex + (toIndex - i)] = tmp; //Приравниваем противоположную ячейку к временной перменной
        }
    }
    public static int fromToLeftShift(int[] array, int fromIndex, int toIndex, int amount) {
        //Делаем как нас учили на уроке :)
        amount = amount % (toIndex - fromIndex + 1);
        if(amount == 0) {
            return 1; //Костыль, чтоб не сдвигать если сдвиг приводит к тому же ( там просто ниче не работает если 0 :) )
        }
        fromToReverse(array,fromIndex, fromIndex + amount - 1); //Магия
        fromToReverse(array,fromIndex + amount, toIndex); //Магия
        fromToReverse(array,fromIndex,toIndex);
        return 0;
    }
}