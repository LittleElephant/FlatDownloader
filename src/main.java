import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        String request = "http://www.moscowmap.ru/adress_all.asp?dom=74450";
//        Address current = new Address(request);
        AddressList list = new AddressList();
        for (Address current: list.GetAddressList()){
            System.out.println(current.name + "\t" + current.flatNumber);
        }

//        System.out.println(current.name + "\t" + current.flatNumber);
    }
}
