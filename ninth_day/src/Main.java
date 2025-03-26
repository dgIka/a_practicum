
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ваня", "ИТ");
        Teacher teacher = new Teacher("Павел", "САОД");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}