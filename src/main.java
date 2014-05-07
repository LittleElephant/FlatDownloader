import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        String request = "http://www.moscowmap.ru/adress_all.asp?dom=817";
        AddressList list = new AddressList();
        list.GetAddressList();



//        System.out.println(current.name + "\t" + current.flatNumber);
    }
}
