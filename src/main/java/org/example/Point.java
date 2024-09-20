package org.example;

public class Point {
    private int x;
    private int y;


    public Point (int x, int y){
        this.x = x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
    public double distance(int a, int b) {
        return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
}

