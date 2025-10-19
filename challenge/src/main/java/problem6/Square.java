package problem6;

public class Square extends Forme{
    private double length;

    public Square(double length){
        this.length = length;
    }
    public double getSurface(){
        return length * length;
    };

    @Override
    public String toString(){
        return "Square (side " + length + "cm)";
    }
}