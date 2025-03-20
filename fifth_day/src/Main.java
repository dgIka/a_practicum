
public class Main {
    public static void main(String[] args) {
        Car car = new Car(1991, "White", "Camry");
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
class Car {
    private int year;
    private String color;
    private String model;

    public Car(int year, java.lang.String color, java.lang.String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}