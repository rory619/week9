package ie.atu;

public class Customer extends Person{
    private String custNo;
    private boolean mailingList;
    public Customer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    public Customer(String name, String address, String phoneNumber, String custNo, boolean mailingList) {
        super(name, address, phoneNumber);
        this.custNo = custNo;
        this.mailingList = mailingList;
    }

    public Customer(String custNo) {
        this.custNo = custNo;
    }

    public  Customer(){
        this.custNo = "";

        }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo() {
        this.custNo = custNo;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList() {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", custNo='" + custNo + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
