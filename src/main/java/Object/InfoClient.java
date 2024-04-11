package Object;

public class InfoClient extends InfoDepartment{
    private String ma_khachhang;
    private String hoten_khachhang;
    private int tongngaythue_khachhang;

    public InfoClient() {
    }
    public InfoClient(int maphong, String ma_khachhang, String hoten_khachhang, int tongngaythue_khachhang) {
        super(maphong);
        this.ma_khachhang = ma_khachhang;
        this.hoten_khachhang = hoten_khachhang;
        this.tongngaythue_khachhang = tongngaythue_khachhang;
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

    public int getTongngaythue_khachhang() {
        return tongngaythue_khachhang;
    }

    public void setTongngaythue_khachhang(int tongngaythue_khachhang) {
        this.tongngaythue_khachhang = tongngaythue_khachhang;
    }
    // Tinh da hinh
    public void list_infoclient() {
        System.out.println(getMaphong() + getMa_khachhang() + getHoten_khachhang() + getTongngaythue_khachhang());
    }
}
