package lesson_4;

public class Cat extends Animal {
    public static int countCats = 0;
    private boolean isFull; // Сытость

    public Cat(String name) {
        super(name);
        this.isFull = false; // При создании кот голоден
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 200)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    // Метод покушать из миски
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            this.isFull = true;
            System.out.println(name + " поел " + amount + "шт. еды и наелся.");
        } else {
            System.out.println(name + " пытался съесть " + amount + ", но в миске только " + bowl.getFood() + ". Кот остался голодным.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}