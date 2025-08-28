public class Course {

    static int maxCapacity =100;

    String courseName;

    int enrollments;

    String [] enrolledStudents;


    Course(String courseName ){
          this.courseName = courseName;
          enrollments =0;
          this.enrolledStudents = new String[maxCapacity];

    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity =maxCapacity;
    }


    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;

    }

    void unenrollStudent(String studentName){
        System.out.println("removed students");

    }

    public static void main(String[] args) {

        Course ug = new Course("Bca");
        Course pg = new Course("mca");

        ug.enrollStudent("nandita");
        ug.enrollStudent("xyz");
        pg.unenrollStudent("wer");


    }
}
