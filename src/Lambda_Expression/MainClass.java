package Lambda_Expression;

public class MainClass {
    public static void main(String[] args) {
        //Subclass implementation
        MyInterImpl myInter = new MyInterImpl();
        myInter.sayHello();

        //Anonymous class implementation
        MyInterface myInterface = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Implementation of interface through anonymous class");
            }
        };
        myInterface.sayHello();

        //Lambda expression
        MyInterface myInterface2 = ()-> System.out.println("Implementation of interface Lambda expression");
        myInterface2.sayHello();

        SumInterface sumInterface = (a, b) -> a + b;
        System.out.println(sumInterface.sum(2,4));
        System.out.println(sumInterface.sum(5,88));


        LengthInter lengthInter = s -> s.length();
        System.out.println(lengthInter.getLength("priyanshu"));


    }
}
