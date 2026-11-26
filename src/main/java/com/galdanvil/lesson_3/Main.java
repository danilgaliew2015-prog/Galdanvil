package com.galdanvil.lesson_3;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 5 товаров
        Product[] productsArray = new Product[5];

        // Заполняем массив объектами
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.09.2024", "Apple", "China", 6500, false);
        productsArray[2] = new Product("Xiaomi 14", "10.11.2024", "Xiaomi", "China", 3500, true);
        productsArray[3] = new Product("Google Pixel 8", "20.10.2024", "Google", "Vietnam", 4200, false);
        productsArray[4] = new Product("Nothing Phone 2", "05.07.2024", "Nothing", "India", 3000, true);

        // Выводим информацию о каждом товаре в консоль
        System.out.println("--- Список товаров ---");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }

        // Проверяем класс Park с вложенным классом
        System.out.println("\n--- Информация о парке ---");
        Park.Attraction ferrisWheel = new Park.Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        ferrisWheel.printInfo();
    }
}
