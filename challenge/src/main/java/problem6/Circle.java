package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getSurface(){
        return 3.14 * radius * radius;
    };

    @Override
    public String toString(){
        return "Square (radius " + radius + "cm)";
    }

}