package Xixixixi;

public class Course {
    private static int i = 1;
    private String name;
    private byte credit;
    private String courseID ;

    public Course(){
        this.courseID = "ISAH--00" + i;
        i++;
    }

    public Course(String name, byte credit) {
        this();
        this.name = name;
        this.credit = credit;
    }

    public String getCourseName(){
        return this.name;
    }

    public String getCourseID(){
        return this.courseID;
    }

    public byte getCredit() {
        return this.credit;
    }
}
