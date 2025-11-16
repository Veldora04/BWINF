package com.BWINF;

public class Vector {
    public double x;
    public double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector sub(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }

    public double scalarProduct(Vector v) {
        return x*v.x + y*v.y;
    }

    public double norm2() {
        return Math.sqrt(x*x + y*y);
    }

    public double angle(Vector v) {
        return Math.toDegrees(Math.acos(this.scalarProduct(v)/(norm2()*v.norm2())));
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
//    public static void main(String[] args) {
//        Vector v = new Vector(0,1);
//        Vector w = new Vector(-1,0);
//
//        System.out.println(v.angle(w));
//    }
}

