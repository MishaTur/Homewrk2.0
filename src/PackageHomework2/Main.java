package PackageHomework2;

import PackageHomework2.Car;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("White", 2015);
        BMW.setColor("White");
        BMW.setAge(2015);
        System.out.println(BMW.getColor() + " " + BMW.getAge());


    }
}
