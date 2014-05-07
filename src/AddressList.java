import java.io.IOException;
import java.util.ArrayList;

public class AddressList {
    public void GetAddressList() throws IOException {
        String reqBase = "http://www.moscowmap.ru/adress_all.asp?dom=";
        String request;
        ArrayList<Address> addressList = null;
        Address current;
        GetAddress getAddress = new GetAddress();
        for (int i = 1939; i < 2000; i++) {
            request = reqBase + i;
            current = getAddress.getAddress(request);
            String eqStreets = "Улицы Москвы – Список улиц";
            if (current.name.equals(eqStreets)) {
                System.out.println("Пустой индекс: " + i);
            }
            else{
                System.out.println(current.name + "\t" + current.flatNumber + "\t" + "Индекс:" + "\t" +i);
            }
        }

//        return addressList;
    }
}
