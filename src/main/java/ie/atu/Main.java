package ie.atu;

public class Main {
    public static void main(String[] args){



        Customer Customer1 = new Customer("Rory","galway","000","dsds",true);
       System.out.println(Customer1.toString());
        Customer Part2 = new Customer();
        Part2.setCustNo();
        Part2.setMailingList();
        Part2.setAddress();
        Part2.setName();
        Part2.setPhoneNumber();
        System.out.println(Part2.toString());
    }

}