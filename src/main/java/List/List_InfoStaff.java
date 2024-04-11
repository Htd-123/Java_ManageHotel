package List;

import Object.InfoStaff;

import java.util.LinkedHashSet;
import java.util.Set;

public class List_InfoStaff extends InfoStaff {
    Set<List_InfoStaff> infoStaffSet = new LinkedHashSet<>();
    public List_InfoStaff() {}
    public List_InfoStaff(String ma_nhanvien, String ten_nhanvien, String chucvu_nhanvien) {
        super(ma_nhanvien, ten_nhanvien, chucvu_nhanvien);
    }
    public Set<List_InfoStaff> getInfoStaffSet() {
        return infoStaffSet;
    }

    public void setInfoStaffSet(Set<List_InfoStaff> infoStaffSet) {
        this.infoStaffSet = infoStaffSet;
    }

    public void list_InfoStaff() {
        infoStaffSet.add(new List_InfoStaff("mnv_01", " Le Quyen Phong", "Nhan vien"));
        infoStaffSet.add(new List_InfoStaff("mnv_02", "Ly Giao Dao", "Nhan vien"));
        infoStaffSet.add(new List_InfoStaff("mnv_03", "Phan Nhut Hao", "Quan ly"));
        infoStaffSet.add(new List_InfoStaff("mnv_04", "Huynh Thanh Duy", "Giam doc dieu hanh"));
    }
}
