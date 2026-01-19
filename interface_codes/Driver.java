package interface_codes;

public class Driver {
    public static void main(String[] args) {

        Person p = new Person();

        p.setM(new Samsung());
        MobileHelper.useMobile(p.getM());

        System.out.println("-----");

        p.setM(new Apple());
        MobileHelper.useMobile(p.getM());

        System.out.println("-----");

        p.setM(new Moto());
        MobileHelper.useMobile(p.getM());
    }
}
