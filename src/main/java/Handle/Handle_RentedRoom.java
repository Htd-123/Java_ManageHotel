package Handle;

import Object.InfoClient;

import java.util.ArrayList;
import java.util.List;

public class Handle_RentedRoom {
    List<InfoClient> list_rentedroom = new ArrayList<>();
    public void add_rentedroom(InfoClient room) {
        list_rentedroom.add(room);
    }
    public void show_rentedroom() {
        System.out.println("-----------------");
        for (InfoClient list_rentedrooms: list_rentedroom) {
            System.out.print("Ma phong: " + list_rentedrooms.getMaphong() + " | ");
            System.out.println("Ten khach hang: " + list_rentedrooms.getHoten_khachhang());
        }
        System.out.println("-----------------");
    }
}
