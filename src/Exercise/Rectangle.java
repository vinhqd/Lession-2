package Exercise;

public class Rectangle {
    private double pointX;
    private double pointY;
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double pointX, double pointY, double length, double width) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.length = length;
        this.width = width;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
