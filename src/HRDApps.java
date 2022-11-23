import Xixixixi.Employee;
import Xixixixi.Manager;

public class HRDApps {
    public static void main(String [] args){
        Employee e = new Employee("Shogun", 1);
        // promotion atau disebut sebagai polimorphysm di mana satu obyek punya dua bentuk
        Employee m = new Manager("Yae", 2);

        e.setDepartment("Finance and Accounting");
        e.setSalary(15_000_000);
        m.setDepartment("Information Technology");
        m.setSalary(30_000_000);

        //casting obyek atau mengembalikan ke jati dirinya
        Manager m1 = (Manager)m;
        m1.setAllowance(500_000);

        e.displayEmployee();
        m.displayEmployee();
    }
}
