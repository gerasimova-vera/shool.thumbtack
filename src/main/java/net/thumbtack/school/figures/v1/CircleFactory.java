package net.thumbtack.school.figures.v1;

public class CircleFactory extends Circle{
     private  static int count = 0;

    public static Circle createCircle(Point center, int radius){
        Circle createCircle = new Circle(center, radius);
        CircleFactory.count++;
        return createCircle;
    }

    public static int getCircleCount(){
        return count;

    }
    public static void reset(){
        CircleFactory.count = 0;
    }
}
