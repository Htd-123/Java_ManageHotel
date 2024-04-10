package Handle;

import Object.InfoClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Handle_EmptyRoom {
    List<InfoClient> list_emptyroom = new ArrayList<>();
    public void add_emtyroom(InfoClient room) {
        list_emptyroom.add(room);
    }
    public void show_emptyroom() {
        System.out.println("-----------------");
        for (InfoClient list_emptyrooms: list_emptyroom) {
            System.out.println("Ma phong: " + list_emptyrooms.getMaphong());
            System.out.println("Ma khach hang: " + list_emptyrooms.getMa_khachhang());
            System.out.println("Ten khach hang: " + list_emptyrooms.getHoten_khachhang());
            System.out.println("So ngay thue: " + list_emptyrooms.getTongngaythue_khachhang());
            System.out.println("-----------------");
        }
    }
}
