package rosecka.sara.contact;

//import myExeptions.*;

public class Contact {
    private String firstName;
    private String surname;
    private String phoneNumber;
    private String address;
    private Contact next;

    public Contact(String firstName, String surname, String phoneNumber, String address, Contact next) {
        this.firstName = firstName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.next = next;
    }

    public String toString(){
            System.out.println("First name: "+this.firstName+" "+"Surname: "+this.surname+"\n Phone number: "+this.phoneNumber+"\n Adress: "+this.address);
            return ("First name: "+this.firstName+" "+"Surname: "+this.surname+"\n Phone number: "+this.phoneNumber+"\n Adress: "+this.address);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == 9){
            this.phoneNumber = phoneNumber;
        }else{

        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNext(Contact next) {
        this.next = next;
    }

    public Contact getNext() {
        return this.next;
    }
}
