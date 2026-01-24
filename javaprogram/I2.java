public class I2 {
    public static void main(String[] args) {
        int a = 7, b = 10;

        System.out.println("Before Swap: a=" + a + ", b=" + b);

        // XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap: a=" + a + ", b=" + b);
    }
}