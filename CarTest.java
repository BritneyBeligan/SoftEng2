import java.util.ArrayList;
import java.util.List;

public class CarTest{
    public static void main(String[] args){
        

        Car myCar = new Car.CarBuilder()
        
        .engineType("Gasoline")
        .transmission("Manual")
        .color("Black")
        .capacity(10)
        .brand("Toyota Rush")
        .build();

        System.out.println("Hello! ");
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Engine Type: " +myCar.getengineType());
        System.out.println("Transmission: " +myCar.getTransmission());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Capacity: " + myCar.getCapacity());
        

    }
}