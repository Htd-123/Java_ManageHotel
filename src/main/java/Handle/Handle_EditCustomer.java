package Handle;

import java.util.ArrayList;
import java.util.List;
import Object.InfoClient;
import Utils.Utilities;

public class Handle_EditCustomer extends Handle_InfoClient{
    private int maphongmoi;
    private int tongngaythue_khachhangmoi;
    List<InfoClient> list_infoclient = new ArrayList<>();
    public void edit_infoclient (InfoClient client, String makhachhang_new) {
        list_infoclient.add(client);
        for (InfoClient add_listinfoclient: list_infoclient) {
            if (add_listinfoclient.getMa_khachhang().equals(makhachhang_new)) {
                System.out.print("Cap nhat ma phong: ");
                maphongmoi = Utilities.scanner.nextInt();
                System.out.print("Cap nhat so ngay thue: ");
                tongngaythue_khachhangmoi = Utilities.scanner.nextInt();
                add_listinfoclient.setMaphong(maphongmoi);
                add_listinfoclient.setTongngaythue_khachhang(tongngaythue_khachhangmoi);
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
