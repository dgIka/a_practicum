
public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1973, 357, 35);
        airplane.fillUp(89);
        airplane.info();
        Teacher teacher = new Teacher("Светлана", "Русский язык");
        Student igor = new Student("Игорь");
        teacher.evaluate(igor);
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
    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDiffernece(int year) {
        if (year > this.year) return year - this.year;
        else return this.year - year;
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
class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info() {
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight
        + ", количество топлива в баке: " + this.fuel);
    }
    public void fillUp(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return this.fuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}