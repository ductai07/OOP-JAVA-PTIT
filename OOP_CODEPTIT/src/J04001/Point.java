package J04001;

public class Point {
    private double x,y;
    public Point(){

    }
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {

    }
    public double getX(double x){
        return this.x;
    }
    public double getY(double y){
        return this.y;
    }
    public double distance(Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.x - this.x, 2) + Math.pow(secondPoint.y - this.y, 2));
    }

    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }


}
