package Day_11;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        this.warehouse.setBalance(this.warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        salary += 300;
    }
}
