package Xixixixi;

public class Customer {
    //Tipe karakter tekstual
    private String name = "Oracle Customer";
    private char sex = 'M';

    //Bilangan Bulat
    private byte age = 0; //2^7 s.d 2^7-1 ==> 8 bit
    private short customerID = 0; //-2^15 s.d (2^15)-1 ==> 16 bit
    private double balance = 0.0; //-2^31 s.d (2^31)-1 ==> 32 bit
    private long identityID = 0L; //-2^63 s.d (2^63)-1 ==> 64 bit
    private char Customertype;
    private String customerTypeName;

    //Bilangan Desimal
    private float discount = 0.0F; //32 bit
    private double balanceInDollar = 0.0; //64bit

    //Boolean
    private boolean isGold = false; //Bisa False or True

    //Constructor = fungsi yang dipanggil ketika objek dibuat
    //Konstruktor default, biasanya untuk menginisialisasi nilai-nilai atribut/field
    public Customer() {
        customerID = 1234;
    }

    //Method yang mengembalikan nilai
    public String getName() {
        return this.name;
    }

    //Method yang mengembalikan nilai
    public float getAmount(float amount) {
        float newAmount = amount - (this.discount * amount);
        return newAmount;
    }

    //If Else
    public void confirmGender(char sex) {
        if (sex == 'M' || sex == 'm' || sex == 'F' || sex == 'f'){
            this.sex = sex;
        }else{
            System.out.println("Mohon isi data dengan benar");
        }
    }

    //Overloading Constructor
    public Customer(String name, char sex, byte age) {
        this(); //Harus dibaris pertama konstruktor
        this.name = name;
        confirmGender(sex);
        this.age = age;
    }

    public void setCustomerProfile(char customerType, double balanceInDollar, float discount) {
        this.Customertype = customerType;
        confirmCustomerType(customerType);
        this.balanceInDollar = balanceInDollar;
        this.discount = discount;
    }

    //Switch case == match case
    private void confirmCustomerType(char customerType) {
        customerTypeName = switch (this.Customertype) {
            case 'A' -> "Platinum";
            case 'B' -> "Gold";
            case 'C' -> "Silver";
            default -> "Reguler";
        }; //char, byte, short, int
    }

    //For Loop
    public void forLoop() {
        /* $
         * $ $
         * $ $ $
         */
        for (byte i = 0; i <= 5; i++) {
            for (byte j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println("");
        }
    }

    //While Loop
    public void whileLoop() {
        byte i = 0;
        do {
            System.out.println("# ");
            i++;
        }while(i < 20);
    }

    //Mengembalikan nilai namanya function kalo yang gamengembalikan namanya method
    //Bisa pake this.variabel kalo males scroll
    //Void gabisa mengembalikan nilai
    public void displayCustomer() {
        System.out.println("Name            : " + this.name);
        System.out.println("Sex             : " + sex);
        System.out.println("Customer ID     : " + customerID);
        System.out.println("Age             : " + age);
        System.out.println("Discount        : " + discount);
        System.out.println("Customer Type   : " + this.customerTypeName);
        System.out.println("Balance in $    : " + this.balanceInDollar);
        System.out.println("=====================================");
        }
}