// Student.java
public class Student {
    private String name;
    private int age;
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade );
    }

    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Ali", 20, 44);
        Student student2 = new Student("Ayşe", 22, 67);
        Student student3 = new Student("Fatma", 27, 54);
        Student student4 = new Student("Kerem", 23, 29);
        Student student5 = new Student("Sude", 23, 100);

        // Displaying student info
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();
    }
}
