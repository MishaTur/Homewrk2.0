package Car2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car AUDI = new Car(2018, 200, 3000, "Black");
        Car Camry = new Car(2015, 225, 1800, "Yellow");
        Car BMW = new Car(2020, 180, 3500, "Blue");
        AUDI.setAge(2018);
        AUDI.setColor("Black");
        AUDI.setSpeed(200);
        AUDI.setWeight(3000);
        Camry.setAge(2015);
        Camry.setColor("Yellow");
        Camry.setSpeed(225);
        Camry.setWeight(1800);
        BMW.setAge(2020);
        BMW.setColor("Blue");
        BMW.setSpeed(225);
        BMW.setWeight(3500);
        System.out.println("Car AUDI have " + AUDI.getAge() + " " + AUDI.getColor() + " " + AUDI.getSpeed() + " " + AUDI.getWeight());
        System.out.println("Car Camry have " + Camry.getAge() + " " + Camry.getColor() + " " + Camry.getSpeed() + " " + Camry.getWeight());
        System.out.println("Car BMW have " + BMW.getAge() + " " + BMW.getColor() + " " + BMW.getSpeed() + " " + BMW.getWeight());


    }
}





