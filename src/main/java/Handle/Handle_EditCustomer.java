package Handle;

import java.util.ArrayList;
import java.util.List;
import Object.InfoClient;
import Utils.Utilities;

public class Handle_EditCustomer extends Handle_InfoClient{
    private String ma_khachhang;
    List<InfoClient> list_infoclient = new ArrayList<>();
    public void edit_infoclient (InfoClient client) {
        list_infoclient.add(client);
        System.out.println("-----------------");
        System.out.println("Nhap ma khach hang can sua: ");
        ma_khachhang = Utilities.scanner.nextLine();
        for (int i = 0; i < list_infoclient.size(); i++) {
            if (list_infoclient.get(i).equals(ma_khachhang)) {

                break;
            }
        }
    }
    @Override
    public void show_infoclient() {
        System.out.println("-----------------");
        for (InfoClient newclient: list_infoclient) {
            System.out.print("Ma phong: " + newclient.getMaphong() + " | ");
            System.out.print("Ma khach hang: " + newclient.getMa_khachhang() + " | ");
            System.out.print("Ho ten khach hang: " + newclient.getHoten_khachhang() + " | ");
            System.out.println("So ngay thue: " + newclient.getTongngaythue_khachhang());
        }
        System.out.println("-----------------");
    }
}
