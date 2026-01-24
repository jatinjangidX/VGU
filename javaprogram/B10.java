
    
public class B10{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // length = 5

        System.out.println("Array length: " + arr.length);

        // Trying to access index 10
        try {
            System.out.println("Element at index 10: " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
 