public class Studentinfo {
    private int studentID;
    private String studentName;

    public static int objectCounter = 0;

    Studentinfo (){
        studentID = 0;
        studentName = "Matt";
        objectCounter++;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void printObjectCounter(){
        System.out.println("The current count is " + objectCounter);
    }

}

