class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Jofre Rodriguez";
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "QWE567";
        car2.driver = "Alejandro Rodriguez";
        car2.passenger = 3;
        car2.printDataCar();
    }

}