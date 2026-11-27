package lesson_4;

public abstract class Animal {
    protected String name;

    // Статическое поле для подсчета всех животных
    public static int countAnimals = 0;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    // Абстрактные методы
    public abstract void run(int distance);
    public abstract void swim(int distance);
}
