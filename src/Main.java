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
        //Запись k и m и преобразование их в индекс
        int k = in.nextInt() - 1;
        int m = in.nextInt() - 1;
        int r = in.nextInt();
        //Циклический сдвиг влево на такую величину, что он аналогичен сдвигу вправо :)
        //А именно -- длинна сдвигаемого отрезка (колво элементов) = (toIndex - fromIndex + 1)
        // - величина сдвига вправо те r (на всякий берем остаток от деления на длинну)
        // А если серьезно, то это тоже магия
        fromToLeftShift(array,k,m,(m - k + 1) - r % (m - k + 1));
        for(int i : array) {
            System.out.print(i + " ");
        }
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