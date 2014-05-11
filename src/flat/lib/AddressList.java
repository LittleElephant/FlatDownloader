package flat.lib;

import flat.lib.Address;

import java.io.IOException;
import java.util.ArrayList;

public class AddressList {
    public void GetAddressList() throws IOException {
        String reqBase = "http://www.moscowmap.ru/adress_all.asp?dom=";
        String request;
        ArrayList<Address> addressList = null;
        Address current;
        GetAddress getAddress = new GetAddress();
        int interval = 5;
        int iBase = 2290;
        for (int i = 2290; i < 3000; i++) {
            request = reqBase + i;
            current = getAddress.getAddress(request);
            String eqStreets = "Улицы Москвы – Список улиц";
            if (current.name.equals(eqStreets)) {
                System.out.println("Пустой индекс: " + "\t" + "\t" + "\t" + i);
            }
            else{
                System.out.println(current.name + "\t" + current.flatNumber + "\t" + "Индекс:" + "\t" +  +i);
            }
            if (i == interval + iBase){
                interval = interval + 5;
                try {
                    Thread.sleep(15000);
                }
                catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }

            }


            }

//        return addressList;
    }
}
