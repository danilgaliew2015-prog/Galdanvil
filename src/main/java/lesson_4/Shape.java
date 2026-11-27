package lesson_4;

public interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    // Дефолтный метод (Java 8+)
    default void printInfo() {
        System.out.println("Фигура: " + getClass().getSimpleName() +
                " | Периметр: " + getPerimeter() +
                " | Площадь: " + getArea() +
                " | Цвет фона: " + getFillColor() +
                " | Цвет границы: " + getBorderColor());
    }
}