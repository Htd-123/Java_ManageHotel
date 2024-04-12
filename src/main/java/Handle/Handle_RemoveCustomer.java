package Handle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Object.InfoClient;
public class Handle_RemoveCustomer {
    List<InfoClient> list_removeclient = new ArrayList<>();

    public void remove_client (InfoClient client, String remove_makhachhang) {
        list_removeclient.add(client);
        for (Iterator<InfoClient> iterator = list_removeclient.iterator(); iterator.hasNext();) {
            InfoClient remove = iterator.next();
            if (remove.getMa_khachhang().equals(remove_makhachhang)){
                iterator.remove();
                System.out.println("Xoa thanh cong");
            }
        }
    }

    public void show_removeclient() {
        System.out.println("--------Danh Sach Sau Khi Xoa---------");
        for (InfoClient remove_listnews: list_removeclient) {
            System.out.print("Ma phong: " + remove_listnews.getMaphong() + " | ");
            System.out.print("Ma khach hang: " + remove_listnews.getMa_khachhang() + " | ");
            System.out.print("Ho ten khach hang: " + remove_listnews.getHoten_khachhang() + " | ");
            System.out.println("So ngay thue: " + remove_listnews.getTongngaythue_khachhang());
        }
        System.out.println("-----------------");
    }

    public List<InfoClient> getList_removeclient() {
        return list_removeclient;
    }

    public void setList_removeclient(List<InfoClient> list_removeclient) {
        this.list_removeclient = list_removeclient;
    }
}
