package core_java;

class App {
    String name;
    String type;
    double users;

    public App() {
    }

    public void printApp() {
        System.out.println(name);
        System.out.println(type);
        System.out.println(users);
    }
}

public class Inheritance_Whatsapp extends App {

    String version;
    long phone;

    public Inheritance_Whatsapp(String name, String type, double users, String version, long phone) {

        this.name = name;
        this.type = type;
        this.users = users;

        this.version = version;
        this.phone = phone;
    }

    public void printWhatsapp() {
        printApp(); 
        System.out.println(version);
        System.out.println(phone);
    }

    public static void main(String[] args) {

        Inheritance_Whatsapp w =
                new Inheritance_Whatsapp(
                        "WhatsApp",
                        "Messaging",
                        2000,
                        "2.24.1",
                        9876543210L
                );

        w.printWhatsapp();
    }
}
