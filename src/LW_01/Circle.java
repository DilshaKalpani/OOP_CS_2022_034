package LW_01;

public class Circle {
    double radius;
    Circle(double rad){
        radius = rad;
    }

    public double computeArea(){
        double area;
        area = Math.PI*radius*radius;
        return area;
    }

    public double computeCircumferece(){
        double circumference;
        circumference = 2*Math.PI*radius;
        return circumference;
    }
}
