package Handle;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import Object.InfoClient;
import Utils.Utilities;

public class Handle_Checkin{
    private int maphong;
    private String ma_khachhang;
    private String hoten_khachhang;
    private int tongsongaythue_khachhang;
    Set<InfoClient> infoClients = new LinkedHashSet<>();
    List<Integer> danhsachphongdangthue = new ArrayList<>();

    //phuong thuc xu ly chon phong cho khach hang
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
        infoClients.add(new InfoClient(maphong, ma_khachhang, hoten_khachhang, tongsongaythue_khachhang));
        danhsachphongdangthue.add(maphong);

        for (Integer trong: danhsachphongdangthue) {
            System.out.println("Danh sach phong dang cho thue " + trong);
        }
    }
}
