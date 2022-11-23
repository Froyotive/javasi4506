package Xixixixi;
import interfaces.ExtraCampus;
import interfaces.Tridharma;

public class Student implements Tridharma, ExtraCampus {
    private static int i = 1;
    private String name;
    private int studentID = 1202210206 ;
    private String department;
    private Course[] courses =new Course[5];
    private int j;

    public Student() {
        this.studentID = studentID + i ;
        i++;
    }

    public Student(String name, String department){
        this();
        this.name = name;
        this.department = department;
    }

    public void addCourse(Course course){
        try{
            this.courses[j] = course;
        }catch (Exception e){
            System.out.println("Maaf Anda Hanya Boleh Mengambil 5 Mata Kuliah");
        }
        j++;
    }

    public void displayStudentProfile(){
        System.out.println("Name            : " + this.name);
        System.out.println("Student ID      : " + this.studentID);
        System.out.println("Department      : " + this.department);
        System.out.println("List of Courses : ");

        for (Course c : this.courses){
            System.out.println(c.getCourseID() + " " + c.getCourseName() + " " + c.getCredit() + " credits");
        }
        System.out.println("===============================================");
    }

    @Override
    public void doteaching() {
        System.out.println("Algoritmas mahasiswa mengajar");
    }

    @Override
    public void doresearch() {
        System.out.println("Algoritma mahasiswa riset");
    }

    @Override
    public void docommunityservices() {
        System.out.println("Algoritma mahasiswa abdimas");
    }

    @Override
    public void joinCompetition() {
        System.out.println("Algoritma mahasiswa mengikuti lomba");
    }

    @Override
    public void joinOlympic() {
        System.out.println("Algoritma mahasiswa mengikuti olimpiade");
    }
}
