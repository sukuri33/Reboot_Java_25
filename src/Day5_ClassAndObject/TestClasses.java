package Day5_ClassAndObject;

public class TestClasses {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setInfo("BMW","E30",1988,"Black",30000.00);
        bmw.start();
        System.out.println(bmw);
    }

}
