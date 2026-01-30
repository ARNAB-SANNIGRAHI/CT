package dsa_DAY1_Assignment;

public class BinaryString {
    public static void main(String[] args) {
        String str = "10101";
        boolean isBinary = true;

        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary ? "Binary String" : "Not a Binary String");
    }
}
