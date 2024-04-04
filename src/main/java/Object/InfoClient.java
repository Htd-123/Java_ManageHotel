package Object;

public class InfoClient {
    private String ma_khachhang;
    private String hoten_khachhang;
    private String sodienthoai_khachhang;

    public InfoClient() {

    }
    public InfoClient(String ma_khachhang, String hoten_khachhang, String sodienthoai_khachhang) {
        this.ma_khachhang = ma_khachhang;
        this.hoten_khachhang = hoten_khachhang;
        this.sodienthoai_khachhang = sodienthoai_khachhang;
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

    public String getSodienthoai_khachhang() {
        return sodienthoai_khachhang;
    }

    public void setSodienthoai_khachhang(String sodienthoai_khachhang) {
        this.sodienthoai_khachhang = sodienthoai_khachhang;
    }

}
