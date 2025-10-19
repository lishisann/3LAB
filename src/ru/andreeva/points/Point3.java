package ru.andreeva.points;

public class Point3 extends AbstractPoint {
    public Point3(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(String.format("{%d, %d, %d}", x, y, z));

        if (color != null) {
            result.append(" ").append(color);
        }
        if (createTime != null) {
            result.append(" ").append(createTime);
        }

        return result.toString();
    }
}
