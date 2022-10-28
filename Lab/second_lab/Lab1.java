package Lab.second_lab;

import java.util.Scanner; 

public class Lab1 {
    public static void main(String[] args) {
        // add scaner to read coord from console
        Scanner in = new Scanner(System.in);
        System.out.print("Input first point coordinates: ");
        String [] p1 = in.nextLine().split(" ");
        System.out.print("Input second point coordinates: ");
        String [] p2 = in.nextLine().split(" ");
        System.out.print("Input third point coordinates: ");
        String [] p3 = in.nextLine().split(" ");
        in.close();
        // create 3 instances of class Point3d
        Point3d point1 = new Point3d(Double.parseDouble(p1[0]), Double.parseDouble(p1[1]), Double.parseDouble(p1[2]));
        Point3d point2 = new Point3d(Double.parseDouble(p2[0]), Double.parseDouble(p2[1]), Double.parseDouble(p2[2]));
        Point3d point3 = new Point3d(Double.parseDouble(p3[0]), Double.parseDouble(p3[1]), Double.parseDouble(p3[2]));
        // main condition to print the ansew for user
        if ((point1.equals(point2)) || point1.equals(point3) || point2.equals(point3)) {
            System.out.println("Two points are at the same coordinates");
        }
        // calling method computeArea wich returns square
        else System.out.println(computeArea(point1, point2, point3));
    }
    // calling separated coords from original Point3d 
    public static double distanceTo(Point3d args1, Point3d args2) {
        // returns length of line beetwen to points from arguments
        return (Math.sqrt(Math.pow(args1.getX() - args2.getX(), 2) +
            Math.pow(args1.getY() - args2.getY(), 2) +
                Math.pow(args1.getZ() - args2.getZ(), 2)));
    }
    // calling distanceTo and send him examples of class from begining
    public static double computeArea(Point3d points1, Point3d points2, Point3d points3) {
        // represents 3 sides of triangle
        double side1 = distanceTo(points1, points2);
        double side2 = distanceTo(points2, points3);
        double side3 = distanceTo(points2, points3);

        double halfPerimetr = (side1+side2+side3)/2;
        // square with uncountable decimal places after coma
        double square = Math.sqrt(halfPerimetr*(halfPerimetr-side1)*(halfPerimetr-side2)*(halfPerimetr-side3));
        // format decimal places after coma
        double hundred = Math.pow(10, 2);
        return Math.ceil(square * hundred) / hundred;
    }
}