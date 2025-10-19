package ru.andreeva.points;

// Класс Точка (Point)
public class Point2D {
    private double x;
    private double y;

    // Конструктор, требует обязательно координаты X и Y
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Сеттеры
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    //Метод, чтобы сдвинуть точку
    public void shiftPointTo(double x, double y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                     // тот же объект
        if (obj == null || getClass() != obj.getClass()) return false;

        //Double.compare корректно сравнивает double
        Point2D other = (Point2D) obj;
        return Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0;
    }
}
