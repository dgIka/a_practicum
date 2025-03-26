package taskTwo;

public class Triangle extends Figure{
    public int firstSide;
    public int secondSide;
    public int thirdSide;

    @Override
    public double area() {
        double pperimeter = (firstSide + secondSide + thirdSide)/2;
        return (double) Math.sqrt(pperimeter * (pperimeter - firstSide) * (pperimeter - secondSide) * (pperimeter - thirdSide));
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    public Triangle(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }
}
