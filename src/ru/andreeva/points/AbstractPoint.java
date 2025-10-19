package ru.andreeva.points;

public abstract class AbstractPoint {
    protected Integer x;
    protected Integer y;
    protected Integer z;

    protected String color;
    protected String createTime;

    public AbstractPoint(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
