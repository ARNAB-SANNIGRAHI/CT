package core_java;

public class ForEach {

    static void show(int... n) {
        for (int i : n)
            System.out.println(i);
    }

    public static void main(String[] args) {
        show(5, 10, 15, 20);
    }
}
