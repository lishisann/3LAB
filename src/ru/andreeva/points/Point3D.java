package ru.andreeva.points;

public class Point3D extends Point2D {
    //Объявляем только 3 ось, так как X и Y наследуется из Point
    // и по умолчанию есть в дочернем классе
    private double z;

    ///
    /// super представляет собой родительский класс
    ///

    //Использование super() == использование конструктора родительского класса
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void shiftPointTo(double x, double y, double z) {
        // Использование метода родительского класса через super
        super.shiftPointTo(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{" + super.getX() + "; " + super.getY() + "; " + z + "}";
    }
}
