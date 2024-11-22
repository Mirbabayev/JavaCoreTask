public class Student extends Academy {
    private String stud_Id;
    private String course;

    public Student() {
    }

    public Student(String stud_Id, String course) {
        this.stud_Id = stud_Id;
        this.course = course;
    }

    public Student(String acadAddress, String acadName, String stud_Id, String course) {
        super(acadAddress, acadName);
        this.stud_Id = stud_Id;
        this.course = course;
    }


    public String getStud_Id() {
        return stud_Id;
    }

    public void setStud_Id(String stud_Id) {
        this.stud_Id = stud_Id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void study(){
        System.out.println(stud_Id +" telebe "+course+" kursunu alir.");
    }



}
