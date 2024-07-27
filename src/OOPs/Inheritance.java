package OOPs;

class Car{
    // the car has two fields
    public int gear;
    public int speed;

    // The car class has one constructor
    public Car(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    // toString method to print info of car
    @Override
    public String toString() {
        return "Car{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
class Defender extends Car{
     public int noOfSeats;
     public int price;
    public Defender(int gear, int speed, int noOfSeats, int price) {
        super(gear, speed);
        this.noOfSeats = noOfSeats;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Defender{" +
                "noOfSeats=" + noOfSeats +
                ", price=" + price +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
public class Inheritance {
    public static void main(String[] args) {
       Defender defender = new Defender(7, 240, 8, 200000000);
        System.out.println(defender);
        Car car = new Car(5, 120);
        System.out.println(car);
        Car car1 = new Defender(7, 240, 8, 200000000);
        System.out.println(car1);
    }
}
