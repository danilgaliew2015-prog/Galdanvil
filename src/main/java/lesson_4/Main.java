package lesson_4;

public class Main {
    public static void main(String[] args) {
        // Создаем миску с 10 единицами еды
        Bowl bowl = new Bowl(10);

        // Создаем котов и собак
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");

        // Создаем массив котов
        Cat[] cats = {cat1, cat2};

        // Просим котов поесть (Барсик съест 6, Мурзику достанется 4, но он просит 5)
        cat1.eat(bowl, 6);
        cat2.eat(bowl, 5);

        // Выводим информацию о сытости
        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт: " + cat.isFull());
        }

        // Добавляем еду в миску
        bowl.addFood(20);
        cat2.eat(bowl, 5);
        System.out.println("Кот " + cat2.name + " сыт: " + cat2.isFull());

        // Проверка методов бега и плавания
        dog1.run(150);
        dog1.swim(5);
        cat1.swim(10);

        // Вывод счетчиков
        System.out.println("Всего животных: " + Animal.countAnimals);
        System.out.println("Всего котов: " + Cat.countCats);
        System.out.println("Всего собак: " + Dog.countDogs);


 System.out.println("\n--- Задание 2: Геометрия ---");
Shape circle = new Circle(5.0, "Красный", "Черный");
Shape rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
Shape triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}