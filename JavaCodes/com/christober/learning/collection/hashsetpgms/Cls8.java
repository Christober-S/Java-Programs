package christober.learning.collection.hashsetpgms;

public class Cls8 {
    // WAP to add names of 5 studets into hashset and print all names
    static void main() {
        java.util.HashSet<String> students = new java.util.HashSet<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        System.out.println("Student names in the HashSet:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
