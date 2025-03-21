public class Teacher {
    private  String name;
    private  String subject;

    public String getName() {
        return name;
    }
    public void evaluate(Student student) {
        int grade = (int) ((Math.random() * 3) + 2);
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " +
                this.subject + "на оценку " + grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
