package christober.learning.interviewquestions;

public class Pgm1 {
    static void main() {
        Employee obj = new Employee();
        System.out.println("Main Method");
        obj.age = 25;
        obj.name = "Christober";
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
