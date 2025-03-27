package Day_11;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);
        while (warehouse.getBalance() < 1000000) {
            courier.doWork();
        }
        courier.bonus();
        while (warehouse.getCountOrder() < 1500) {
            picker.doWork();
        }
        picker.bonus();
        System.out.println(warehouse);
        System.out.println("Зарплата курьера: " + courier.getSalary());
        System.out.println("Зарплата сборщика: " + picker.getSalary());
    }
}
