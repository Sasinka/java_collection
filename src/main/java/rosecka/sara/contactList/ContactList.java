package rosecka.sara.contactList;

import rosecka.sara.contact.Contact;

public class ContactList {
    private Contact node;
    private Contact first = null;
    private Contact last = null;


    //new Contact list
    public ContactList(Contact node) {

            this.node = node;
            this.first = node;
            this.last = this.first;
            this.first.setNext(this.last);

       //this.last.getNext(null);

    }

    public ContactList(String name, String surname, String phoneNumber, String address){
        Contact contact = new Contact(name, surname, phoneNumber, address, null);
        this.node = node;
        this.first = node;
        this.last = this.first;
        this.first.setNext(this.last);
    }



    public void addLast(Contact node){
        this.last.setNext(node);
        this.last = node;
        //this.last.setNext(node);
    }

    public String toString(Contact node){
        return ("Name: "+node.getFirstName()+"\n surname: "+node.getSurname()+"\n phone number: "+node.getPhoneNumber()+"\n adress:"+node.getAddress());
    }

    public Contact getNode() {
        return node;
    }

    public void setNode(Contact node) {
        this.node = node;
    }

    public void setNode(String firstName, String surname, String phoneNumber, String address, Contact next) {
        this.node = new Contact(firstName, surname, phoneNumber, address, null);
    }


}
