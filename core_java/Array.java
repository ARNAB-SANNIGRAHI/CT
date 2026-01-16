package core_java;

public class Array {

    public static void main(String[] args) {
        int[] i = {2, 4, 7};

        String[] s = {"Hello", "ABC", "XYZ"};

        char[] c = {'A', 'B', 'C'};

        double[] d = {1.00, 2.43, 4.43};

        float[] f = {2.2f, 8.5f, 0.2f};

        System.out.println("Integer Array:");
        printIntArray(i);

        System.out.println("\nString Array:");
        printStringArray(s);

        System.out.println("\nCharacter Array:");
        printCharArray(c);

        System.out.println("\nDouble Array:");
        printDoubleArray(d);

        System.out.println("\nFloat Array:");
        printFloatArray(f);
    }

    static void printIntArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void printStringArray(String[] arr) {
        for (String x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void printCharArray(char[] arr) {
        for (char x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void printDoubleArray(double[] arr) {
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void printFloatArray(float[] arr) {
        for (float x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
