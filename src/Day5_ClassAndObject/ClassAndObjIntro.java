package Day5_ClassAndObject;

public class ClassAndObjIntro {
    public static void main(String[] args) {
//        MyClass.printHelloWorld();
        MyClass obj1 = new MyClass();
        obj1.age = 18;
        obj1.name = "John";
        obj1.ageAndName();
        obj1.printHelloWorld();
    }
}
