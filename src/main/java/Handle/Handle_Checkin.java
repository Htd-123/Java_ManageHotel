package Handle;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import Object.InfoClient;
import Utils.Utilities;

public class Handle_Checkin{
    Handle_EmptyRoom handleEmptyRoom = new Handle_EmptyRoom();
    private int maphong;
    private String ma_khachhang;
    private String hoten_khachhang;
    private int tongsongaythue_khachhang;
    Set<InfoClient> infoClients = new LinkedHashSet<>();

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public String getMa_khachhang() {
        return ma_khachhang;
    }

    public void setMa_khachhang(String ma_khachhang) {
        this.ma_khachhang = ma_khachhang;
    }

    public String getHoten_khachhang() {
        return hoten_khachhang;
    }

    public void setHoten_khachhang(String hoten_khachhang) {
        this.hoten_khachhang = hoten_khachhang;
    }

    public int getTongsongaythue_khachhang() {
        return tongsongaythue_khachhang;
    }

    public void setTongsongaythue_khachhang(int tongsongaythue_khachhang) {
        this.tongsongaythue_khachhang = tongsongaythue_khachhang;
    }

    public Set<InfoClient> getInfoClients() {
        return infoClients;
    }

    public void setInfoClients(Set<InfoClient> infoClients) {
        this.infoClients = infoClients;
    }

    public void input_checkin() {
        //Nhap thong tin khach hang
        System.out.println("-----------------");
        System.out.print("Nhap chon ma phong: ");
        maphong = Utilities.scanner.nextInt();
        // Tieu diet ky tu xuong dong trong nextInt
        Utilities.scanner.nextLine();
        System.out.print("Nhap ma khach hang: ");
        ma_khachhang = Utilities.scanner.nextLine();
        System.out.print("Nhap ho ten khach hang: ");
        hoten_khachhang = Utilities.scanner.nextLine();
        System.out.print("Nhap tong so ngay thue phong: ");
        tongsongaythue_khachhang = Utilities.scanner.nextInt();
        System.out.println("Da them thanh cong");
        System.out.println("-----------------");
        InfoClient newcustomer = new InfoClient(maphong, ma_khachhang, hoten_khachhang, tongsongaythue_khachhang);
        infoClients.add(newcustomer);
    }

    public void access_handleemptyroom() {
        for (InfoClient customer: infoClients) {
            handleEmptyRoom.add_emtyroom(customer);
        }
        handleEmptyRoom.show_emptyroom();
    }
}
