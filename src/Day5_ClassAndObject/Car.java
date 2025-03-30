package Day5_ClassAndObject;

public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;
    //This will later be the Constructor of the class
    public void setInfo(String make,String model,int year,String color,double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void start(){
        System.out.println(this.make+" started! Ready to GO!");
    }

    public String toString() {
        return "Car make:"+make+" Car model:"+model;
    }
}
