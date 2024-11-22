public class Teacher extends Academy{
    private String teacher_Id;
    private String subject;

    public Teacher() {
    }

    public Teacher(String teacher_Id, String subject) {
        this.teacher_Id = teacher_Id;
        this.subject = subject;
    }

    public Teacher(String acadAddress, String acadName, String teacher_Id, String subject) {
        super(acadAddress, acadName);
        this.teacher_Id = teacher_Id;
        this.subject = subject;
    }

    public String getTeacher_Id() {
        return teacher_Id;
    }

    public void setTeacher_Id(String teacher_Id) {
        this.teacher_Id = teacher_Id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void teach(){

        System.out.println(teacher_Id+" nomreli muellim "+subject+" fennini tedris edir.");


    }




}
