import java.util.ArrayList;
import java.util.List;

public class Car{
    String brand;
    protected final String engineType;
    protected final  String transmission;
    protected final  String color;
    protected final int capacity;
    protected List<String> carInfo;
    private List<String> CarAssemble;
    private Car.CarBuilder builder;

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.capacity = builder.capacity;
        this.CarAssemble = builder.CarAssemble;
    }

    protected static class CarBuilder{ 
        private String brand;
        private String engineType;
        private String transmission;
        private String color;
        private int capacity;
        private List<String> CarAssemble = new ArrayList<>();
   
        public CarBuilder brand(String brand){
            this.brand = brand;
            return this;
        }
    
        public CarBuilder engineType(String engineType){
            this.engineType = engineType;
            return this;
        }
    
        public CarBuilder transmission(String transmission){
            this.transmission = transmission;
            return this;
        }
    
        public CarBuilder color(String color){
            this.color = color;
            return this;
        }
    
        public CarBuilder capacity(int capacity){
            this.capacity = capacity;
            return this;
        }
    
    
        public Car build(){
            return new Car(this);
        }

      
          
    }
    public String getBrand(){
        return brand;
       }
       
       public String getengineType(){
        return engineType;
    } 
    public String getTransmission(){
        return transmission;
    }

    public String getColor(){
        return color;
    }

    public int getCapacity(){
        return capacity;
    }



}