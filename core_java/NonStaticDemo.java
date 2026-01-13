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
        NonStaticDemo e1=new NonStaticDemo();
        NonStaticDemo e2=new NonStaticDemo();
        System.out.println("main end");
    }
}
