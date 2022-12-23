package Lab.lab2;

public class Point3d extends Point2d {
    //added z coordinate
    private Double zCoord;

    public Point3d (double x, double y, double z) {  
        super(x, y);
        this.zCoord = z;
    }

    public boolean equals(Point3d points1) {
        if (points1.getX() == this.getX() & points1.getY() == this.getY() & points1.getZ() == this.getZ()) {
            return true;
        }
        return false;
    }

    // Method without arguments returns xyz = 000
    public Point3d () {
        this(0, 0, 0);
    }

    
    // We got access to z coord
    public double getZ () {
        return this.zCoord;
    }

    public void setZ ( double val) {
        this.zCoord = val;
    }
}