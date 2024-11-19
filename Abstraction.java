
abstract class Shape{
    protected double a;
    public double p;
    abstract void area();
    abstract void perimeter();
}
class Circle extends Shape{
    int rad;
    Circle(int x){
        this.rad = x;
    }
    @Override
    void area(){
        super.a =  3.14*rad*rad;
    }
    @Override
    void perimeter(){
        super.p = 2*3.14*rad;
    }
    void display(){
        area();
        perimeter();
        System.out.println("Area of Circle : "+super.a+"\nCircumference of Circle : "+super.p);
    }
}
class Rectangle extends Shape{
    int l,b;
    Rectangle(int x,int y){
        this.l = x;
        this.b = y;
    }
    @Override
    void area(){
        super.a =  l*b;
    }
    @Override
    void perimeter(){
        super.p =  2*(l+b);
    }
    void display(){
        area();
        perimeter();
        System.out.println("Area of Rectangle : "+super.a+"\nPerimeter of Rectangle : "+super.p);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.display();
        Rectangle r = new Rectangle(10,5);
        r.display();
    }
}
