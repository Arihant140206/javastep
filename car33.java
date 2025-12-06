import java.util.*;

class Car {
    
    String model;
    int year;
    String color;


    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    
    void displayCarInfo() {
         System.out.print("Arihant Jain - RA2411026010366 \n");
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("-----------------------");
    }
}

public class car33{
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Hyundai i20", 2021, "White");
        Car car2 = new Car("Tata Nexon", 2023, "Blue");

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
