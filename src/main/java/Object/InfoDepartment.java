package Object;

public class InfoDepartment {
    private int maphong;
    private String tenphong;
    private int giaphong;
    public InfoDepartment() {

    }
    public InfoDepartment(int maphong) {
        this.maphong = maphong;
    }
    public InfoDepartment(int maphong, String tenphong, int giaphong) {
        this.maphong = maphong;
        this.tenphong = tenphong;
        this.giaphong = giaphong;
    }
    public int getMaphong() {
        return maphong;
    }
    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }
    public String getTenphong() {
        return tenphong;
    }
    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }
}
