package rosecka.sara;


import rosecka.sara.contactList.ContactList;
import rosecka.sara.contact.Contact;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Contact first = new Contact("Sára", "Rosecká", "777538049", "Pod fialkou 4, Praha 5", null);
        ContactList listOfEmployee = new ContactList (first);

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        for(int i = 0; i < 3; i++){
        //while("y".equals(s)){
            //13 je znak pro enter
            System.out.print("Enter name:");
            String firstName = in.next();
            System.out.print("Enter surname:");
            String lastName = in.next();
            System.out.print("Enter phone number:");
            String phoneNumber = in.next();
            System.out.print("Enter address:");
            String address = in.next();
            Contact newContact = new Contact(firstName, lastName, phoneNumber, address, null);
            listOfEmployee.addLast(newContact);
            System.out.print("Do you wanna end? (y/n):");
            s = in.next();
        }
        System.out.println(listOfEmployee.toString(first));
        System.out.println(listOfEmployee.toString(first.getNext()));
        System.out.println(listOfEmployee.toString(first.getNext().getNext()));
    }
}
