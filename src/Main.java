import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Карпов", "Аввакуум", "Денисович");

        controller.createStudent("Горшков", "Игорь", "Данилович");
        controller.createStudent("Ковалёв", "Максимилиан", "Никитевич");
        controller.createStudent("Колесников", "Соломон", "Матвеевич");

        controller.studyGroup(controller.getAllTeacher(),controller.getAllStudent());
        System.out.println();
        controller.getStudyGroup();
    }
}