package homework10.association;
import java.io.*;
import java.util.*;

public class User7 {
    private final List<Address7> addresses;
    User7(List<Address7>addresses)
    {
        this.addresses = addresses;
    }

    public List<Address7> getTotalAddresses()
    {

        return addresses;
    }
}
