package com.epam.rd.autotasks.figures;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Quadrilateral extends Figure{
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {



        double Sabc = 0.5*Math.abs((b.getX()-a.getX())*(c.getY()-a.getY())-(c.getX()-a.getX())*(b.getY()-a.getY()));
        double Sacd = 0.5*Math.abs((c.getX()-a.getX())*(d.getY()-a.getY())-(d.getX()-a.getX())*(c.getY()-a.getY()));
        double S = Sabc + Sacd;
        return S;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")"+"(" + b.getX() + "," + b.getY() + ")"+"(" + c.getX() + "," + c.getY() + ")"+"(" + d.getX() + "," + d.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        Point[] arrayX = new Point[] {a, b, c, d};
        Point left = arrayX[0];
        for(int i=1;i<arrayX.length;i++){
            if(arrayX[i].getX() < left.getX()){left = arrayX[i];}

        }
        return left;
    }

    public Point getA() {return a;}
    public Point getB() {return b;}
    public Point getC() {return c;}
    public Point getD() {return d;}
}
