package com.sprint.inheritance;

public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius<0){
            radius =0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
