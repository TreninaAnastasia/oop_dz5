interface iGetView {
    void display(String message);
}

class ViewClassEng implements iGetView {
    @Override
    public void display(String message) {
        System.out.println("ENG: " + message);
    }
}
import java.util.HashMap;
import java.util.Map;

interface iGetModel {
    void addStudent(int id, Student student);
    void deleteStudent(int id);
    Student getStudent(int id);
}

class ModelClassHash implements iGetModel {
    private Map<Integer, Student> students = new HashMap<>();

    @Override
    public void addStudent(int id, Student student) {
        students.put(id, student);
    }

    @Override
    public void deleteStudent(int id) {
        students.remove(id);
    }

    @Override
    public Student getStudent(int id) {
        return students.get(id);
    }
}

class Student {
    // Поля и методы класса Student
}
class Controller {
    private iGetModel model;
    private iGetView view;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        // Логика выполнения команд, включая DELETE
        switch(command) {
            case "DELETE":
                int studentId = // получить ID студента от пользователя
                if(model.getStudent(studentId) != null) {
                    model.deleteStudent(studentId);
                    view.display("Student deleted.");
                } else {
                    view.display("Student not found.");
                }
                break;
            // Остальные команды
        }
    }
}
