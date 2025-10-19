package ru.andreeva.geometry;

import ru.andreeva.points.Point2D;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    // Для хранения точек используется динамический массив,
    // позволяющий в любой момент добавить в него новый элемент
    private ArrayList<Point2D> point2DS = new ArrayList<>();

    // Конструктор с точками
    public Polyline(List<Point2D> point2DS) {
        this.point2DS = new ArrayList<>(point2DS);
    }

    // Конструктор без точек
    public Polyline() {
        this.point2DS = new ArrayList<>();
    }

    // Добавление точки
    public void addPoint(Point2D point2D) {
        point2DS.add(point2D);
    }


    // Сдвигаем точку ломанной по индексу, с указанием координат
    public void shiftPointToByIndex(int index, double x, double y) {
        point2DS.get(index).shiftPointTo(x, y);
    }


    // Получение длины ломаной линии
    public double getLength() {
        double length = 0.0;

        for (int i = 1; i < point2DS.size(); i++) {
            Point2D point2D1 = point2DS.get(i - 1);
            Point2D point2D2 = point2DS.get(i);

            double dx = point2D2.getX() - point2D1.getX();
            double dy = point2D2.getY() - point2D1.getY();

            length += Math.sqrt(dx * dx + dy * dy);
        }

        return length;
    }


    @Override
    public String toString() {
        // Используем StringBuilder для удобной работы со строками
        StringBuilder result = new StringBuilder("Линия [");

        for (int i = 0; i < point2DS.size(); i++) {
            result.append(point2DS.get(i).toString());
            if (i < point2DS.size() - 1) {
                result.append(", ");
            }
        }

        result.append("]");
        return result.toString();
    }
}
