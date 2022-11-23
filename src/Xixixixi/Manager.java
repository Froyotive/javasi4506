package Xixixixi;

public class Manager extends Employee{
    private int allowance;

    public Manager(){

    }

    public Manager(String name, int id){
        super(name, id);
    }

    public void setAllowance(int allowance){
        this.allowance = allowance;
    }

    //memodifikasi method parentnya disebut sebagai overrideng method
    public void displayEmployee(){
        super.displayEmployee();
        System.out.println("Allowance       : " + this.allowance);
        System.out.println("-----------------------------------------");
    }
}
