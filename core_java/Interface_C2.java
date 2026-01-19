package core_java;

public class Interface_C2 extends C1 implements I1 {
    public static void main(String[] args) {
        C1 c1 = new Interface_C2();
        I1 i1 = new Interface_C2();
        I2 i2 = new Interface_C2();
        I3 i3 = new Interface_C2();
        System.out.println(c1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}

class C1 {
}

interface I1 extends I2, I3 {
}

interface I2 {
}

interface I3 {
}
