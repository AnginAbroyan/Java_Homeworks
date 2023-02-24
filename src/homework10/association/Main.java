package homework10.association;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //EX 5.
//        Employee5 anEmployee = new Employee5("45652");
//        Bank5 bank = new Bank5(anEmployee);


        //EX 6.
//        Heart6 aHeart = new Heart6();
//        Human6 aHuman = new Human6();

        //EX 7.
        Address7 add1 = new Address7("aaaa");
        Address7 add2 = new Address7("bbbb");
        Address7 add3 = new Address7("cccc");

        List<Address7> addresses = new ArrayList<Address7>();

        addresses.add(add1);
        addresses.add(add2);
        addresses.add(add3);

        User7 user = new User7(addresses);

        List<Address7> adr = user.getTotalAddresses();

        // Iterating over books using for each loop
        for (Address7 ad : adr) {
            System.out.println("Addresses : " + ad.address_name);
        }
    }
}
