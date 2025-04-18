public class Teacher extends Human{
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
