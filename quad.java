package com.company;

public class quad {
    public static void main(String[] args) {
        Quadrilateral q = new Quadrilateral( 1.3, 1.4, 6.8, 3.0, 6.4, 10.1, 2.4, 7.6 );

        Trapezoid t = new Trapezoid( 1.0, 1.0, 11.0, 1.0, 9.0, 6.0, 4.3, 6.0 );

        Parallelogram p = new Parallelogram( 7.5, 7.5, 13.5, 7.5, 14.5, 22.5, 8.5, 22.5 );

        Rectangle r = new Rectangle( 20.0, 17.0, 33.0, 17.0, 33.0, 31.0, 20.0, 31.0 );

        Square s = new Square( 4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );

        System.out.printf("%s %s %s %s %s\n", q, t, p, r, s );
    }
}

class Point{
    private double x;
    private double y;

    public Point( double xCoordinate, double yCoordinate ) {
        x = xCoordinate;
        y = yCoordinate;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public String toString() {
        return String.format( "( %.1f, %.1f )", getX(), getY() );
    }
}

class Quadrilateral {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;


    public Quadrilateral( double x1, double y1, double x2, double y2,
                          double x3, double y3, double x4, double y4 ) {
        p1 = new Point( x1, y1 );
        p2 = new Point( x2, y2 );
        p3 = new Point( x3, y3 );
        p4 = new Point( x4, y4 );

    }
    public Point getPoint1() {
        return p1;
    }

    public Point getPoint2() {
        return p2;
    }

    public Point getPoint3() {
        return p3;
    }

    public Point getPoint4() {
        return p4;
    }

    public String toString() {

        return String.format( "%s:\n%s",
                "Coordinates of Quadrilateral are", getCoordinate() );
    }

    public String getCoordinate() {
        return String.format(
                "%s, %s, %s, %s\n", p1, p2, p3, p4 );
    }
}

class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid( double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4 ) {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );

    }

    public double getHeight() {
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint2().getY() - getPoint3().getY() );
        else
            return Math.abs( getPoint1().getY() - getPoint2().getY() );

    }

    public double getArea() {
        return getSumOfTwoSides() * getHeight() / 2.0;
        //by the formula
        //(1/2) * sum_of_lenght_perpenducular * lenght of diagonal

    }

    public double getSumOfTwoSides() {
        if ( getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint1().getX() - getPoint2().getX() ) +
                    Math.abs( getPoint3().getX() - getPoint4().getX() );
        else
            return Math.abs( getPoint2().getX() - getPoint3().getX() ) +
                    Math.abs( getPoint4().getX() - getPoint1().getX() );

    }

    public String toString() {
        return String.format( "\n%s:\n%s%s:  %s\n",
                " Trapezoid's Coordinates (x1,y1) , (x2,y2) , (x3,y3) , (x4,y4) ", getCoordinate(),
                 "Area ", getArea() );

    }
}
class Parallelogram extends Trapezoid {
    public Parallelogram(double x1, double y1, double x2, double y2,
                         double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }

    public double getWidth() {
        if (getPoint1().getY() == getPoint2().getY())
            return Math.abs(getPoint1().getX() - getPoint2().getX());
        else
            return Math.abs(getPoint2().getX() - getPoint3().getX());

    }

    public String toString() {
        return String.format("\n%s:\n%s%s:  %s\n",
                "Parallelogram's Coordinates (x1,y1) , (x2,y2) , (x3,y3) , (x4,y4) ", getCoordinate(),
                "Area ", getArea());

    }
}

class Rectangle extends Parallelogram {

    public Rectangle( double x1, double y1, double x2, double y2,
                      double x3, double y3, double x4, double y4 ) {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );

    }
    public String toString() {
        return String.format( "\n%s:\n%s%s:  %s\n",
                "Rectangle's Coordinates (x1,y1) , (x2,y2) , (x3,y3) , (x4,y4)", getCoordinate(),
                "Area ", getArea() );

    }

}
class Square extends Parallelogram {

    public Square( double x1, double y1, double x2, double y2,
                   double x3, double y3, double x4, double y4 ) {
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }
    public String toString() {
        return String.format( "\n%s:\n%s%s:  %s\n",
                "Square's Coordinates (x1,y1) , (x2,y2) , (x3,y3) , (x4,y4)", getCoordinate(),
                "Area ", getArea() );
    }
}


