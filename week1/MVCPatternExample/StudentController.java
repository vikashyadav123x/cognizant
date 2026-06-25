package MVCPatternExample;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudent(String name, int id, String grade) {
        model.setName(name);
        model.setId(id);
        model.setGrade(grade);
    }

    public void displayStudent() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}
