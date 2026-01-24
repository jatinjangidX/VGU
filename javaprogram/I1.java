class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        // self check
        if (this == obj) return true;

        // null check
        if (obj == null) return false;

        // type check
        if (this.getClass() != obj.getClass()) return false;

        // cast and compare
        Student other = (Student) obj;
        return this.id == other.id;  // equality based on id
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}

// Demo class
public class I1{
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 20);
        Student s2 = new Student(102, "Bob", 21);
        Student s3 = new Student(101, "Alice", 20);

        // Using toString()
        System.out.println(s1.toString());
        System.out.println(s2);  // toString() is called implicitly

        // Using equals()
        System.out.println("s1 equals s2? " + s1.equals(s2));  // false
        System.out.println("s1 equals s3? " + s1.equals(s3));  // true
    }
}
