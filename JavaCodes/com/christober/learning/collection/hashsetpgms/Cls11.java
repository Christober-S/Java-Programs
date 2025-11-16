package christober.learning.collection.hashsetpgms;

import java.util.HashSet;

// Create Student class
record Student(int id, String name, int age) {
    // Constructor

    // toString() to print details
    @Override
    public String toString() {
        return "Student[id=" + id + ", name='" + name + "', age=" + age + "]";
    }

    // equals and hashCode (to avoid duplicate id)
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student s)) return false;
        return this.id == s.id;
    }
}

public class Cls11 {
    // WAP to add names of 5 students Object into hashset and print all the details
    static void main() {

        HashSet<Student> students = new HashSet<>();

        // Add 5 student objects
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 21));
        students.add(new Student(3, "Charlie", 22));
        students.add(new Student(4, "David", 23));
        students.add(new Student(5, "Eva", 20));

        // Print all student details
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
