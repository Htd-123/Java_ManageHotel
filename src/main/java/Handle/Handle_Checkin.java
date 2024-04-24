package Handle;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Set;

import List.List_Department;
import Object.InfoClient;
import Utils.Utilities;

import javax.imageio.IIOException;

public class Handle_Checkin extends InfoClient{
    Handle_RentedRoom handleRentedRoom = new Handle_RentedRoom();
    Handle_EditCustomer handleEditCustomer = new Handle_EditCustomer();
    Handle_InfoClient handleInfoClient = new Handle_InfoClient();
    Handle_RemoveCustomer handleRemoveCustomer = new Handle_RemoveCustomer();
    List_Department listDepartment = new List_Department();
    Handle_Pay handlePay = new Handle_Pay();
    private int maphong;
    private String ma_khachhang;
    private String hoten_khachhang;
    private int tongsongaythue_khachhang;
    private String ma_khachhangmoi;
    private String remove_makhachhang;
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
        // Nhap thong tin khach hang
        System.out.println("-----------------");
        try {
            System.out.print("Nhap chon ma phong: ");
            maphong = Utilities.scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Vui long nhap so nguyen");
        }
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
    // Hien thi cac phong dang cho thue
    public void access_handlerentedroom() {
        for (InfoClient customer: infoClients) {
            handleRentedRoom.add_rentedroom(customer);
        }
        handleRentedRoom.show_rentedroom();
    }
    // Hien thi thong tin khach hang
    public void access_handleinfoclient() {
        for (InfoClient info_customer: infoClients) {
            handleInfoClient.add_infoclient(info_customer);
        }
        handleInfoClient.show_infoclient();
    }
    // Xoa thong tin khach hang
    public void access_handleremoveclient() {
        System.out.print("Nhap ma khach hang can xoa: ");
        Utilities.scanner.nextLine();
        remove_makhachhang = Utilities.scanner.nextLine();
        for (InfoClient remove_customer: infoClients) {
            handleRemoveCustomer.remove_client(remove_customer, remove_makhachhang);
        }
        handleRemoveCustomer.show_removeclient();
    }
    // Tinh da hinh xu ly update thong tin khach hang
    @Override
    public void list_infoclient() {
        System.out.println("-----------------");
        System.out.print("Nhap ma khach hang can sua: ");
        Utilities.scanner.nextLine();
        ma_khachhangmoi = Utilities.scanner.nextLine();
        for (InfoClient edit_customer: infoClients) {
            handleEditCustomer.edit_infoclient(edit_customer, ma_khachhangmoi);
            break;
        }
        handleEditCustomer.show_infoclient();
    }

    public void pay() {
        int maphong;
        System.out.println("-----------------");
        System.out.print("Nhap vao ma khach hang can thanh toan: ");
        Utilities.scanner.nextLine();
        String makhachhang_pay = Utilities.scanner.nextLine();
        for (InfoClient pay_customer: infoClients) {
            if (makhachhang_pay.equals(pay_customer.getMa_khachhang())) {
               listDepartment.pay_InfoDepartment(pay_customer.getTongngaythue_khachhang(), pay_customer.getMaphong());
            }
        }
    }
    public void pay_print() {
        System.out.println("-----------------");
        System.out.print("Nhap vao ma khach hang can in: ");
        Utilities.scanner.nextLine();
        String makhachhang_print = Utilities.scanner.nextLine();
        for (InfoClient pay_customer: infoClients) {
            if (makhachhang_print.equals(pay_customer.getMa_khachhang())) {
                listDepartment.print_pay(pay_customer.getTongngaythue_khachhang(), pay_customer.getMaphong(), pay_customer.getHoten_khachhang());
            }
        }
    }
}
