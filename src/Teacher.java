import java.util.List;

public class Teacher {

    private  String id;
    private String name;
    private String email;
    private String mobileNum;

    public Teacher(String id, String name, String email, String mobileNum) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                '}';
    }

    public void viewStudentsAssignedClasses(){

    }

    public List<Student> getStudentsInCourse(String CourseID){

    }
    public void getAllClasses(){

    }

    public Student getStudentData(String studentId){

    }

    public void addAssignment(Assignment assignment){

    }

    public void submitStudentsAttendance(List<CourseAttendence> courseAttendences){

    }
}
