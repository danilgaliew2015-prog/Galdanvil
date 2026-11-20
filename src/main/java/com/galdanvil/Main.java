package com.galdanvil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1
        printThreeWords();
        // 2
        checkSumSign();
        // 3
        printColor();
        // 4
        compareNumbers();
        // 5
        System.out.println("Задание 5: " + isSumInRange(10, 5));
        // 6
        printNumberSign(-5);
        // 7
        System.out.println("Задание 7: " + isNegative(-3));
        // 8
        printStringMultipleTimes("Привет", 3);
        // 9
        System.out.println("Задание 9 (2024): " + isLeapYear(2024));
        // 10
        int[] binaryArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArr);
        // 11
        fillArrayWithSequence();
        // 12
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplySmallNumbers(arr12);
        // 13
        createDiagonalMatrix();
        // 14
        int[] arr14 = createArray(5, 8);
        System.out.println("Задание 14: " + java.util.Arrays.toString(arr14));
    }

    // 1. Вывод трех слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка знака суммы
    public static void checkSumSign() {
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Определение цвета
    public static void printColor() {
        int value = 101; // Можешь поменять значение для теста
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Сравнение чисел
    public static void compareNumbers() {
        int a = 5;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Сумма в пределах от 10 до 20
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Положительное или отрицательное
    public static void printNumberSign(int number) {
        if (number >= 0) { // По условию 0 - положительное
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Вернуть true, если число отрицательное
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Строка N раз
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9. Високосный год
    public static boolean isLeapYear(int year) {
        // Каждый 4-й, кроме каждого 100-го, при этом каждый 400-й
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Замена 0 на 1 и 1 на 0
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0; // Тернарный оператор
        }
    }

    // 11. Массив 1..100
    public static void fillArrayWithSequence() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // Для проверки можно вывести, но по заданию не обязательно
    }

    // 12. Числа меньше 6 умножить на 2
    public static void multiplySmallNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("Задание 12: " + java.util.Arrays.toString(arr));
    }

    // 13. Квадратный двумерный массив с единицами по диагонали
    public static void createDiagonalMatrix() {
        int size = 5; // Размер матрицы
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Главная диагональ
        }
        System.out.println("Задание 13: матрица создана (вывод для проверки)");
    }

    // 14. Массив заданной длины с заданным значением
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}