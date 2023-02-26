package homework10.association.ex7;
import homework10.association.ex7.Address;

import java.util.*;

public class User {
    public final List<Address> addresses;
    User(List<Address>addresses)
    {
        this.addresses = addresses;
    }

    public List<Address> getTotalAddresses()
    {

        return addresses;
    }
}
