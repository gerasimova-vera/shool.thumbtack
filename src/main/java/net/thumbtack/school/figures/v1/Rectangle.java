package net.thumbtack.school.figures.v1;

import java.util.Objects;

public class Rectangle extends Point{
    private Point leftTop;
    private Point rightBottom;



    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
        }

    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this.leftTop = new Point (xLeft,yTop);
        this.rightBottom = new Point( xRight, yBottom);
    }

    public Rectangle(int length, int width){
        this.leftTop = new Point(0, 0-width);
        this.rightBottom = new Point(length, 0);
    }

    public Rectangle(){
         this.leftTop = new Point(0,-1);
         this.rightBottom = new Point(1, 0);
    }

    public Point getTopLeft()
    {
        return this.leftTop;
    }

    public Point getBottomRight(){
        return rightBottom;
    }

    public void setTopLeft(Point topLeft){
        this.leftTop = topLeft;
    }

    public void setBottomRight(Point bottomRight){
       this.rightBottom = bottomRight;
    }

    public int getLength(){
        int length = rightBottom.getX() - leftTop.getX();
        return length;
    }

    public int getWidth(){
        int width = rightBottom.getY() - leftTop.getY();
        return width;
    }

    public void moveTo(int x, int y){
        rightBottom = new Point(rightBottom.getX()-this.leftTop.getX()+x, rightBottom.getY()+y-this.leftTop.getY());
        leftTop = new Point(x, y);
    }

    public void moveTo(Point point){
        rightBottom = new Point(rightBottom.getX()-this.leftTop.getX()+point.getX(), rightBottom.getY()+point.getY()-this.leftTop.getY());
        leftTop = point;
    }

    public void moveRel(int dx, int dy){
        leftTop = new Point(leftTop.getX()+dx, leftTop.getY()+dy);
        rightBottom = new Point(rightBottom.getX()+dx, rightBottom.getY()+dy);

    }

    public void resize(double ratio){
        int x = (int)(getLength()*ratio+leftTop.getX());
        int y = (int)(getWidth()*ratio+leftTop.getY());
        rightBottom = new Point(x, y);
    }

    public void stretch(double xRatio, double yRatio){
        int x = (int)(getLength()*xRatio+leftTop.getX());
        int y = (int)(getWidth()*yRatio+leftTop.getY());
        rightBottom = new Point(x, y);
    }

    public double getArea(){
        return  getLength() * getWidth();
    }

    public double getPerimeter(){

        return (getLength()*2 + getWidth() * 2);
    }

    public boolean isInside(int x, int y){
        if((x <= rightBottom.getX())&&(x >=leftTop.getX())&&(y>=leftTop.getY())&&(y<=rightBottom.getY())) return true;
        else return false;
    }

    public boolean isInside(Point point){
        int x = point.getX();
        int y = point.getY();
        if((x <= rightBottom.getX())&&(x >=leftTop.getX())
                &&
                (y>=leftTop.getY())&&(y<=rightBottom.getY())) return true;
        else return false;
    }
    public boolean isIntersects(Rectangle rectangle){
        int x1 = rectangle.leftTop.getX();
        int y1 = rectangle.leftTop.getY();
        int x2 = rectangle.rightBottom.getX();
        int y2 = rectangle.rightBottom.getY();
        if(((x1>=leftTop.getX() && x1<=rightBottom.getX())&& (y1>=leftTop.getY() && y1<=rightBottom.getY()))
            ||
                ((x2>=leftTop.getX() && x2<=rightBottom.getX())&& (y2>=leftTop.getY() && y2<=rightBottom.getY()))) return true;
        if(((leftTop.getX()>=x1 && leftTop.getX()<=x2)&&(leftTop.getY()>=y1 && leftTop.getY()<=y2))
            ||
                ((rightBottom.getX()>=x1 && rightBottom.getX()<=x2))&&(rightBottom.getY()>=y1 && rightBottom.getY()<=y2)) return  true;
        else return false;
    }

    public boolean isInside(Rectangle rectangle){
        int x1 = rectangle.leftTop.getX();
        int y1 = rectangle.leftTop.getY();
        int x2 = rectangle.rightBottom.getX();
        int y2 = rectangle.rightBottom.getY();
        if(((x1>=leftTop.getX() && x1<=rightBottom.getX())&& (x2<=rightBottom.getX() && x2>=leftTop.getX()))
                &&
                ((y1>=leftTop.getY() && y1<=rightBottom.getY()) && (y2>=leftTop.getY() && y2<=rightBottom.getY()))) {
            return true;
        }
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return leftTop.equals(rectangle.leftTop) &&
                rightBottom.equals(rectangle.rightBottom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leftTop, rightBottom);
    }
}
