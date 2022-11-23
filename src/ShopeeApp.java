import Xixixixi.Customer;

public class ShopeeApp {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Megawati", 'F', (byte)70);
        Customer cust2 = new Customer("Ganja", 'M', (byte)40);
        Customer cust3 = new Customer("Aldy", 'M', (byte)19);
        Customer cust4 = new Customer("Hilmy", 'M', (byte)48);

        cust1.setCustomerProfile('A', 50_000_000.0, 0.2F);
        cust2.setCustomerProfile('B', 10_000_000.0, 0.1F);
        cust3.setCustomerProfile('C', 10_000_000.0, 0.5F);
        cust4.setCustomerProfile('D', 70_000_000.0, 0.1F);

        cust1.displayCustomer();
        cust2.displayCustomer();
        cust3.displayCustomer();
        cust4.displayCustomer();

        // String name = cust4.getName();
        // System.out.println("\nMemanggil Customer 4 Bernama " + name);
        // float amount = cust4.getAmount(100000.0F);
        // System.out.println("Total Nilai Sebesar Rp." + amount);

        // String confirm = cust2.confirmBikiniPO();
        // System.out.println("\n" + confirm);

        // System.out.println(cust1.getName() + " " + cust1.confirmCustomerType('A')+ "\n");
        // System.out.println(cust2.getName() + " " + cust2.confirmCustomerType('B')+ "\n");
        // System.out.println(cust3.getName() + " " + cust3.confirmCustomerType('C')+ "\n");
        // System.out.println(cust4.getName() + " " + cust4.confirmCustomerType('D')+ "\n");

        // cust1.forLoop();
        // cust2.whileLoop();
}
}