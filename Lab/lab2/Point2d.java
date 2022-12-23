package Lab.lab2;

public class Point2d{

    private double xCoord;

    private double yCoord;

    public Point2d (double x, double y) {
    xCoord = x;
    yCoord = y;
    }
    // Method without arguments returns xyz = 000
    public Point2d () {
        this(0, 0);
    }
    // We got access to x coord
    public double getX () {
        return xCoord;
    }
    // We got access to y coord
    public double getY () {
        return yCoord;
    }

    // Methods below for access to manual change the coords
    public void setX ( double val) {
        xCoord = val;
    }

    public void setY ( double val) {
        yCoord = val;
    }
}