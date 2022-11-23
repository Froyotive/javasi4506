import Xixixixi.Course;
import Xixixixi.Lecturer;
import Xixixixi.Student;
import interfaces.ExtraCampus;
import interfaces.Project;
import interfaces.Tridharma;

public class Academy {
    public static void main(String[] args) {
        Course c1 = new Course("Pemrograman Berorientasi Obyek", (byte)3);
        Course c2 = new Course("Pengantar Pemrograman dan Logika", (byte)3);
        Course c3 = new Course("Statistika Industri", (byte)3);
        Course c4 = new Course("Pemodelan Proses Bisnis", (byte)3);
        Course c5 = new Course("Perilaku Organisasi", (byte)3);

        Student s1 = new Student("Evandani", "Information");
        Student s2 = new Student("Giantino Rafif", "Information System");

        s1.addCourse(c5);
        s1.addCourse(c4);
        s1.addCourse(c3);
        s1.addCourse(c2);
        s1.addCourse(c1);
        s2.addCourse(c2);
        s2.addCourse(c1);
        s2.addCourse(c3);
        s2.addCourse(c4);
        s2.addCourse(c5);

        s1.displayStudentProfile();
        s2.displayStudentProfile();
        /*Tridharma dosen = new Lecturer();
        Tridharma mahasiswa = new Student();
        Project dosen1 = new Lecturer();
        ExtraCampus mahasiswa2 = new Student();

        dosen.doteaching();
        dosen.doresearch();
        dosen.docommunityservices();

        mahasiswa.doteaching();
        mahasiswa.doresearch();
        mahasiswa.docommunityservices();

        dosen1.doInstructructureProject();
        dosen1.doInformationTechnologyProject();

        mahasiswa2.joinCompetition();
        mahasiswa2.joinOlympic();
    }

         */
    }
}
