package Handle;

import List.List_Department;
import List.List_InfoStaff;

import java.util.Set;

public class Handle_InfoStaff {
    List_InfoStaff listInfoStaff = new List_InfoStaff();
    public void show_infostaff() {
        // Lay danh sach thong tin nhan vien
        listInfoStaff.list_InfoStaff();
        Set<List_InfoStaff> infoStaffSet = listInfoStaff.getInfoStaffSet();

        // Duyet in ra danh sach thong tin nhan vien
        System.out.println("-----------------");
        for (List_InfoStaff infoStaffSets: infoStaffSet) {
            System.out.print("Ma nhan vien: " + infoStaffSets.getMa_nhanvien() + " |");
            System.out.print(" Ten nhan vien: " + infoStaffSets.getTen_nhanvien() + " |");
            System.out.println(" Chuc vu: " +  infoStaffSets.getChucvu_nhanvien());
        }
        System.out.println("-----------------");
    }
}
