import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class AddressList {
    public ArrayList<Address> GetAddressList() throws IOException {
        String request = "http://www.moscowmap.ru/adress_all.asp?dom=%i";
        ArrayList<Address> addressList = null;
        for (int i = 0; i < 20; i++){
            request.format(Locale.US, request, i);
            Address current = new Address(request);
            addressList.add(current);
        }
        return addressList;
    }
}
