package Object;

public class InfoDepartment {
    private int maphong;
    private String tenphong;
    public InfoDepartment() {

    }
    public InfoDepartment(int maphong) {
        this.maphong = maphong;
    }
    public InfoDepartment(int maphong, String tenphong) {
        this.maphong = maphong;
        this.tenphong = tenphong;
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
}
