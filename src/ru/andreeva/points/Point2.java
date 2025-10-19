package ru.andreeva.points;

public class Point2 extends AbstractPoint {
    public Point2(int x, int y) {
        super(x, y, null);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("{%d, %d}", x, y));

        if (color != null) {
            result.append(" ").append(color);
        }
        if (createTime != null) {
            result.append(" ").append(createTime);
        }

        return result.toString();
    }
}
