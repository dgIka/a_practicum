package Day_11;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        this.warehouse.setCountOrder(this.warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        salary += 160;
    }
}
