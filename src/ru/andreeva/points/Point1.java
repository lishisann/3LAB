package ru.andreeva.points;

public class Point1 extends AbstractPoint {
    public Point1(int x) {
        super(x, null, null);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("{%d}", x));

        if (color != null) {
            result.append(" ").append(color);
        }
        if (createTime != null) {
            result.append(" ").append(createTime);
        }

        return result.toString();
    }
}
