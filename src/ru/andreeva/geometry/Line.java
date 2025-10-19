package ru.andreeva.geometry;

import ru.andreeva.points.Point2D;

public class Line implements Cloneable{
    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        // создаём копии, чтобы линии не делили одну и ту же точку
        this.start = new Point2D(start.getX(), start.getY());
        this.end = new Point2D(end.getX(), end.getY());
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public void setStart(Point2D start) {
        // снова делаем копию, а не ссылку
        this.start = new Point2D(start.getX(), start.getY());
    }

    public void setEnd(Point2D end) {
        this.end = new Point2D(end.getX(), end.getY());
    }

    public Point2D getStart() {
        // возвращаем копию, чтобы снаружи не смогли изменить оригинал
        return new Point2D(start.getX(), start.getY());
    }

    public Point2D getEnd() {
        return new Point2D(end.getX(), end.getY());
    }

    public int getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверка на тот же объект
        if (obj == null || getClass() != obj.getClass()) return false;  // проверка типа

        Line other = (Line) obj;

        // проверяем совпадение начала и конца
        return this.start.equals(other.start) && this.end.equals(other.end);
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone(); // копируем объект через Object.clone()
        } catch (CloneNotSupportedException e) {
            // вообще сюда попасть нельзя, так как мы реализуем Cloneable
            throw new AssertionError();
        }
    }

}