package HW1_Java;

// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
import java.lang.Short;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
public class Task1 {
    static int i;
    static int n;
    
    static int rnd() {                          // метод рандом в диапазоне -1000;1000
        Random rnd = new Random();
        int i = rnd.nextInt(-1000, 1000);
        return i;
    }
    static int highest_OneBit(int i) {          // метод поиска номера старшей значащего бита
        int n = Integer.highestOneBit(i);
        return n;
    }
   
    public static void main(String[] args) {
        
        int i = rnd();
        System.out.println("Cлучайное целое число i в диапазоне от -1000 до 1000 = " + i); 
        int n = highest_OneBit(i);
        System.out.println("Номер (n) старшего значащего бита числа "+ i + " = " + n); 
        int short_Max = Short.MAX_VALUE;
        System.out.println("Максимальное значение диапазона данных типа Short = " + short_Max); 
        ArrayList <Integer> m1 = new ArrayList<>();
        for (int index = i; index <= short_Max; index++) {
            if (index % n == 0){
                m1.add (index);
            }
        }
        System.out.println("Массив m1:");
        System.out.println(m1);
        int short_Min = Short.MIN_VALUE;
        System.out.println("Минимальное значение диапазона данных типа Short = " + short_Min); 
        ArrayList <Integer> m2 = new ArrayList<>();
        for (int index = i; index >= short_Min; index--) {
            if (index % n != 0){
                m2.add (index);
            }
        }
        System.out.println("Массив m2:");
        System.out.println(m2);
        
        // int shortMin = Short.MIN_VALUE;

        // System.out.println(shortMin);
        // System.out.println(shortMax);   
    }
    
}
