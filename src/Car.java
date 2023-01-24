public class Car {
    Engine engine;
    Car() {
        engine = new Engine();
    }

    public void start() {
        engine.startEngine();
        System.out.println("Car.start()");
    }
}
