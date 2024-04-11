package Handle;

import java.util.ArrayList;
import java.util.List;
import Object.InfoClient;

public class Handle_InfoClient {
    List<InfoClient> list_infoclient = new ArrayList<>();
    public void add_infoclient(InfoClient client) {
        list_infoclient.add(client);
    }
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
