package LW_03;

public class Q3 {


}

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String name, String num) {
        ownerName = name;
        phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        phoneNo = num;
    }
}



class Bicycle {

    private Owner owner;


    public Bicycle() {
        owner = new Owner("Unknown", "Unknown");
    }


    public Bicycle(String name, String num) {
        owner = new Owner(name, num);
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
