package MVCPatternExample;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = new Student("Alice", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.displayStudent();

        controller.updateStudent("Alice Johnson", 102, "A+");
        controller.displayStudent();
    }
}
