package lesson_4;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    // Метод для добавления еды
    public void addFood(int amount) {
        if (amount > 0) {
            this.food += amount;
            System.out.println("В миску добавили " + amount + " еды. Теперь там " + this.food);
        }
    }

    // Уменьшение еды (защита от отрицательного значения)
    public void decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
        }
    }
}