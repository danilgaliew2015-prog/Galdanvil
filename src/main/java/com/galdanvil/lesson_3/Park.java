package com.galdanvil.lesson_3;

public class Park {
    // Внутренний класс Аттракцион
    public static class Attraction {
        String name;
        String workingHours;
        double price;

        // Конструктор
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации
        public void printInfo() {
            System.out.println("Аттракцион: " + name +
                    " | Время работы: " + workingHours +
                    " | Цена: " + price + " руб.");
        }
    }
}