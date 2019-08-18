package net.thumbtack.school.figures.v1;

import java.util.Objects;

public class Ellipse extends Point {
    private   Point centre;
    private int xAxis;
    private int yAxis;

    public Ellipse(Point center, int xAxis, int yAxis){
        this.centre = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis){
        this.centre = new Point(xCenter, yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    public Ellipse(int xAxis, int yAxis){
        this.centre = new Point(0, 0);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    public Ellipse(){
        this.centre = new Point(0, 0);
        this.xAxis = 1;
        this.yAxis = 1;
    }

    public Point getCenter(){
        return centre;
    }

    public int getXAxis(){
        return xAxis;
    }

    public int getYAxis(){
        return yAxis;
    }

    public void setXAxis(int xAxis){
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis){
        this.yAxis = yAxis;
    }

    public void setCenter(Point center){
        int x = center.getX();
        int y = center.getY();
        this.centre = new Point(x, y);
    }

    public void moveTo(int x, int y){
        centre = new Point(x, y);
    }

    public void moveTo(Point point){
        centre = point;
    }

    public void moveRel(int dx, int dy){
        centre = new Point(centre.getX()+dx,centre.getY()+dy);
    }

    public void resize(double ratio){
        this.xAxis = (int)(xAxis*ratio);
        this.yAxis = (int)(yAxis*ratio);
    }

    public void stretch(double xRatio, double yRatio){
        this.xAxis =(int)(xAxis*xRatio);
        this.yAxis = (int)(yAxis*yRatio);
    }

    public double getArea(){
        return  Math.PI * ((xAxis/2)*(yAxis/2));

    }

    public double getPerimeter(){
        double a = xAxis*xAxis;
        double b = yAxis*yAxis;
        double c = (a+b)/8;
        return 2 * Math.PI * Math.sqrt(c);
    }

    public boolean isInside(int x, int y){
        double a = xAxis / 2;
        double b = yAxis / 2;
        x -= getCenter().getX();
        y -= getCenter().getY();
        return ((x * x) / (a * a) + (y * y) / (b * b) <= 1);
    }

    public boolean isInside(Point point){
        int x = point.getX();
        int y = point.getY();
        double a = xAxis / 2;
        double b = yAxis / 2;
        x -= getCenter().getX();
        y -= getCenter().getY();
        return ((x * x) / (a * a) + (y * y) / (b * b) <= 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ellipse ellipse = (Ellipse) o;
        return xAxis == ellipse.xAxis &&
                yAxis == ellipse.yAxis &&
                Objects.equals(centre, ellipse.centre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), centre, xAxis, yAxis);
    }
}
