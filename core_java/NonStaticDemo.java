package core_java;

public class NonStaticDemo {

    {
        System.out.println("NSB1");
    }

    {
        System.out.println("NSB2");
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        new NonStaticDemo();
        System.out.println("main end");
    }
}
