
public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1973, 357, 35);
        Airplane airplane1 = new Airplane("Airbus", 1988, 356, 53);
        Airplane.compareAirplanes(airplane1, airplane);
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

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.getLength() > b.getLength()) {
            System.out.println("Самолет " + a.getProducer() + " производства " + a.getYear() + " года длиннее");
        } else System.out.println("Самолет " + b.getProducer() + " производства " + b.getYear() + " года длиннее");
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