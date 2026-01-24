public class Book {
    // Static variable to keep track of number of instances
    private static int count = 0;

    // Constructor increments static count
    public Book() {
        count++;
    }

    // Static method to return current count
    public static int getCount() {
        return count;
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        System.out.println("Number of Book instances: " + Book.getCount());
    }
}
