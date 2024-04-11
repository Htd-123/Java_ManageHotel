package Object;

public class InfoStaff {
    private String ma_nhanvien;
    private String ten_nhanvien;
    private String chucvu_nhanvien;
    public InfoStaff() {}
    public InfoStaff(String ma_nhanvien, String ten_nhanvien, String chucvu_nhanvien) {
        this.ma_nhanvien = ma_nhanvien;
        this.ten_nhanvien = ten_nhanvien;
        this.chucvu_nhanvien = chucvu_nhanvien;
    }
    public String getMa_nhanvien() {
        return ma_nhanvien;
    }

    public void setMa_nhanvien(String ma_nhanvien) {
        this.ma_nhanvien = ma_nhanvien;
    }

    public String getTen_nhanvien() {
        return ten_nhanvien;
    }

    public void setTen_nhanvien(String ten_nhanvien) {
        this.ten_nhanvien = ten_nhanvien;
    }

    public String getChucvu_nhanvien() {
        return chucvu_nhanvien;
    }

    public void setChucvu_nhanvien(String chucvu_nhanvien) {
        this.chucvu_nhanvien = chucvu_nhanvien;
    }
}
