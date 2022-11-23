package Xixixixi;
import interfaces.Project;
import interfaces.Tridharma;

public class Lecturer implements  Tridharma, Project {
    @Override
    public void doteaching() {
        System.out.println("Ini algoritma dosen mengajar");
    }

    @Override
    public void doresearch() {
        System.out.println("Ini algoritma dosen riset");
    }

    @Override
    public void docommunityservices() {
        System.out.println("Ini algoritma dosen Abdimas");
    }

    @Override
    public void doInformationTechnologyProject() {
        System.out.println("Ini algoritma dosen proyek IT");
    }

    @Override
    public void doInstructructureProject() {
        System.out.println("Ini algoritma dosen proyek infrastruktur");
    }
}
