package LW_03;

public class Q4 {
    public static void main(String[] args) {

        Lecturer lecturer1 = new Lecturer("Dr. Rasika", "CS101");

        Course course1 = new Course("Introduction to Computer Science", "CS101", lecturer1);

        Student student1 = new Student("Dilsha", "BSc Computer Science", course1.getCourseName());

        System.out.println("Course: " + course1.getCourseName() + " (" + course1.getCourseCode() + ")");
        System.out.println("Lecturer: " + course1.getLecturer().getLecturerName());
        System.out.println("Student: " + student1.getStudentName());
        System.out.println("Degree: " + student1.getDegreeName());
        System.out.println("Course Following: " + student1.getCourseFollowing());
    }
}


class Lecturer{
    private String lecturerName;
    private String courseTeaching;

    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course{
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student{
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}