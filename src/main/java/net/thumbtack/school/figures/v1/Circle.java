package net.thumbtack.school.figures.v1;

import java.util.Objects;

public class Circle extends Point {
    private  Point centre;
    private  int radius;

    public Circle(Point center, int radius){
        this.centre = center;
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, int radius){
        this.centre = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(int radius){
        this.centre = new Point(0, 0);
        this.radius = radius;
    }
    public Circle(){
        this.centre = new Point(0, 0);
        this.radius = 1;
    }
    public Point getCenter(){
        return centre;
    }
    public int getRadius(){
        return  radius;
    }
    public void setCenter(Point center){
        this.centre = center;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void moveTo(int x, int y){
        centre = new Point(x, y);
    }
    public void moveTo(Point point){
        centre = point;
    }
    public void moveRel(int dx, int dy){
        centre = new Point(centre.getX()+dx, centre.getY()+dy);
    }
    public void resize(double ratio){
        radius = (int)(radius*ratio);
    }
    public double getArea(){
        return  Math.PI*(radius*radius);
    }
    public double getPerimeter(){
        return Math.PI*(2*radius);
    }

    public boolean isInside(int x, int y){
        int distance =(int)Math.sqrt (((x - centre.getX())*(x - centre.getX()))+ ((y-centre.getY())*(y-centre.getY())));
        return distance <= radius;
    }

    public boolean isInside(Point point){
        int x = point.getX();
        int y = point.getY();
        int distance =(int)Math.sqrt (((x - centre.getX())*(x - centre.getX()))+ ((y-centre.getY())*(y-centre.getY())));
        return distance <= radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                Objects.equals(centre, circle.centre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centre, radius);
    }
}
