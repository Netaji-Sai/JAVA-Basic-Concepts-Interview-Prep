class Vehicle{
    private String brand;
    private int speed;
    Vehicle(String x,int y){
        this.brand  = x;
        this.speed = y;
    }
    String getBrand(){
        return brand;
    }
    int getSpeed(){
        return speed;
    }
}
class Car extends Vehicle{
    int doors;
    Car(String x,int y,int z){
        super(x,y);
        this.doors = z;
    }
    void display(){
        System.out.println("Brand : "+super.getBrand()+"\n"+"Speed : "+super.getSpeed()+"\n"+"Doors : "+doors);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car("Bugati", 120, 2);
        c1.display();
    }
}
