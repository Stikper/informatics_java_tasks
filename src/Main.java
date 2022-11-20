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
        //Реверс массива от 0 до середины и от середины до n-1
        fromToReverse(array, k, m);
        for(int i : array) {
            System.out.print(i +" ");
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
}