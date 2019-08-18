package net.thumbtack.school.figures.v1;

import java.util.Objects;

public class Square extends Point {

    private Point leftTop;
    private int size;


    public Square(Point leftTop, int size){
        this.leftTop = leftTop;
        this.size = size;
    }

    public Square(int xLeft, int yTop, int size){
        this.leftTop = new Point(xLeft, yTop);
        this.size = size;
    }

    public Square(int size){
        this.leftTop = new Point(0,0-size);
        this.size = size;
    }

    public Square(){
        this.leftTop = new Point(0, 0-1);
        this.size = 1;
    }

    public Point getTopLeft(){
        return this.leftTop;
    }

    public Point getBottomRight(){
        Point bottomRight = new Point(leftTop.getX() + size, leftTop.getY()+size);
        return bottomRight;
    }

    public void setTopLeft(Point topLeft){
        this.leftTop = topLeft;
    }
    public int getLength(){
        return  size;
    }

    public void moveTo(int x, int y){
        leftTop = new Point(x, y);
    }

    public void moveTo(Point point){
        leftTop = point;
    }

    public void moveRel(int dx, int dy){
        leftTop = new Point(leftTop.getX()+dx, leftTop.getY()+dy);
    }

    public void resize(double ratio){
        this.size = (int)(size*ratio);

    }
    public double getArea(){
        return size * size;

    }

    public double getPerimeter(){
        return size * 4;

    }

    public boolean isInside(int x, int y){
        if((x>=leftTop.getX())&&(x<=leftTop.getX()+size)&&(y>=leftTop.getY())&&(y<=leftTop.getY()+size)) return true;
        else return false;
    }

    public boolean isInside(Point point){

        if((point.getX()>=leftTop.getX())&&(point.getX()<=(leftTop.getX()+size))
                &&
                (point.getY()>=leftTop.getY())&&(point.getY()<=(leftTop.getY()+size))) return true;
        else return false;
    }

    public boolean isIntersects(Square square){
        if(((square.leftTop.getX()>=leftTop.getX() && square.leftTop.getX()<=leftTop.getX()+size)&& (square.leftTop.getY()>=leftTop.getY() && square.leftTop.getY()<=leftTop.getY()+size))
                ||
                ((square.leftTop.getX()+square.getLength()>=leftTop.getX() && square.leftTop.getX()+square.getLength()<=leftTop.getX()+size)&& (square.leftTop.getY()+square.getLength()>=leftTop.getY() && square.leftTop.getY()+square.getLength()<=leftTop.getY()+size))) return true;
        if(((leftTop.getX()>=square.leftTop.getX() && leftTop.getX()<=square.leftTop.getX()+square.getLength())&&(leftTop.getY()>=square.leftTop.getY() && leftTop.getY()<=square.leftTop.getY()+square.getLength()))
                ||
                ((leftTop.getX()+size>=square.leftTop.getX() && leftTop.getX()+size<=square.leftTop.getX()+square.getLength()))&&(leftTop.getY()+size)>=square.leftTop.getY() && leftTop.getY()+size<=square.leftTop.getY()+square.getLength()) return  true;
        else return false;
    }

    public boolean isInside(Square square){
        if(((square.leftTop.getX()>=leftTop.getX() && square.leftTop.getX()<=leftTop.getX()+size)&& (square.leftTop.getY()>=leftTop.getY() && square.leftTop.getY()<=leftTop.getY()+size))
                &&
                ((square.leftTop.getX()+square.getLength()>=leftTop.getX() && square.leftTop.getX()+square.getLength()<=leftTop.getX()+size)&& (square.leftTop.getY()+square.getLength()>=leftTop.getY() && square.leftTop.getY()+square.getLength()<=leftTop.getY()+size))) return true;
        else return  false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return size == square.size &&
                leftTop.equals(square.leftTop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leftTop, size);
    }
}
