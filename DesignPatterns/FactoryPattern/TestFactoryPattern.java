package DesignPatterns.FactoryPattern;

public class TestFactoryPattern {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));

        // Building small car
        // DesignPatterns.FactoryPattern.SmallCar@36aa7bc2
        // Building sedan car
        // DesignPatterns.FactoryPattern.SedanCar@182decdb
        // Building luxury car
        // DesignPatterns.FactoryPattern.LuxuryCar@4361bd48
    }
}

