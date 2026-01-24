public class I8 {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE; // Maximum value for int: 2147483647
        System.out.println("Before overflow: " + x);

        x += 2; // Causes overflow
        System.out.println("After overflow: " + x);
    }
}
