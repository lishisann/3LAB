package ru.andreeva.geometry;

import ru.andreeva.points.Point2D;

import java.util.List;

public class Square {
    private Point2D topLeft;
    private int sideLength;

    //Конструктор с точкой и стороной
    public Square(Point2D topLeft, int sideLength) {
        this.topLeft = new Point2D(topLeft.getX(), topLeft.getY());
        this.sideLength = sideLength;
    }

    //Конструктор с координатами и стороной
    public Square(double x, double y, int sideLength) {
        this.topLeft = new Point2D(x, y);
        this.sideLength = sideLength;
    }

    //Метод для получения ломанной линии
    public Polyline getPolyline() {
        double x = topLeft.getX();
        double y = topLeft.getY();

        Point2D point2D1 = topLeft; // левый верхний
        Point2D point2D2 = new Point2D(x + sideLength, y);
        Point2D point2D3 = new Point2D(x + sideLength, y + sideLength);
        Point2D point2D4 = new Point2D(x, y + sideLength);
        Point2D point2D5 = point2D1; // возвращаемся к началу для замыкания

        return new Polyline(List.of(point2D1, point2D2, point2D3, point2D4, point2D5));
    }


    @Override
    public String toString() {
        return String.format("Квадрат в точке %s со стороной %d", topLeft, sideLength);
    }
}
