package Exeptions.task3_2_5;

public class Auto {

public static class Car implements AutoCloseable {

    void drive() {
        System.out.println("Машина поехала.");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается...");
    }
    public static void main(String[] args) throws Exception {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException ignored) {
        }
    }
}
}