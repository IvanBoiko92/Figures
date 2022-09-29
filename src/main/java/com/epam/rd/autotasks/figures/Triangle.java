package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle extends Figure{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
  }
    public Point getA() {return a;}
    public Point getB() {return b;}
    public Point getC() {return c;}

    public double area() {

        double T = 0.5*Math.abs((b.getX()-a.getX())*(c.getY()-a.getY())-(c.getX()-a.getX())*(b.getY()-a.getY()));
        return T;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")"+"(" + b.getX() + "," + b.getY() + ")"+"(" + c.getX() + "," + c.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        Point[] arrayX = new Point[] {a, b, c};
        Point left = arrayX[0];
        for(int i=1;i<arrayX.length;i++){
            if(arrayX[i].getX() < left.getX()){left = arrayX[i];}

        }
        return left;
    }
}
