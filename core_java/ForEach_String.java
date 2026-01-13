package core_java;

public class ForEach_String {

    public static void con(String... s) {
        String result = "";

        for (String str : s) {
            result += str;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        con("ABC", "DEF");
    }
}
