import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        //Заполнение массива вводимыми числами
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        //Реверс массива от 0 до середины и от середины до n-1
        fromToReverse(array, 0, (n-1)/2);
        fromToReverse(array, (n-1)/2+1, n-1);
        //Вывод массива через пробел
        /*
        for(int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        */
        //Конструкция ниже аналогична закоментированной конструкции выше
        for (int j : array) {
            System.out.println(j);
        }
        in.close();
    }
    //Реверс массива от fromIndex до toIndex
    public static void fromToReverse(int[] array, int fromIndex, int toIndex) {
        int tmp;
        for(int i = fromIndex; i <= fromIndex + (toIndex - fromIndex) / 2; i++) {
            tmp = array[i]; //Записываем значение ячейки массива индекса i во временную перменную
            array[i] = array[fromIndex + (toIndex - i)]; //Приравниваем ячейку массива в i к противоположной в области реверсирования
            array[fromIndex + (toIndex - i)] = tmp; //Приравниваем противоположную ячейку к временной перменной
        }
    }
}