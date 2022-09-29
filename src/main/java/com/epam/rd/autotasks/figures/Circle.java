package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Circle extends Figure{
    private Point center;
    private double radius;

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }

    public String toString() {
        return "Circle[(" + center.getX() + "," + center.getY() + ")"+ radius + "]";
    }

    @Override
    public Point leftmostPoint() {
        Point left = new Point((center.getX()-radius),center.getY());
        return left;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public Point getCenter() {return center;}
    public double getRadius() {return radius;}
}
