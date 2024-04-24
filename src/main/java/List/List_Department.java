package List;

import Object.InfoDepartment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class List_Department extends InfoDepartment {
    Set<List_Department> listDepartmentSet = new LinkedHashSet<>();

    public List_Department() {

    }
    public List_Department(int maphong, String tenphong, int giaphong) {
        super(maphong, tenphong, giaphong);
    }
    public Set<List_Department> getListDepartmentSet() {
        return listDepartmentSet;
    }

    public void setListDepartmentSet(Set<List_Department> listDepartmentSet) {
        this.listDepartmentSet = listDepartmentSet;
    }

    public void list_InfoDepartment() {
        listDepartmentSet.add(new List_Department(301, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(302, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(401, "Phong doi", 100000));
        listDepartmentSet.add(new List_Department(402,"Phong doi",  100000));
        listDepartmentSet.add(new List_Department(501,"Phong vip", 200000));
    }

    public void pay_InfoDepartment(int get_Tongngaythue, int get_maphong) {
        listDepartmentSet.add(new List_Department(301, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(302, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(401, "Phong doi", 100000));
        listDepartmentSet.add(new List_Department(402,"Phong doi",  100000));
        listDepartmentSet.add(new List_Department(501,"Phong vip", 200000));
        for (List_Department department : listDepartmentSet) {
            if (get_maphong == department.getMaphong()) {
                int pay = department.getGiaphong() * get_Tongngaythue;
                System.out.println("So tien can thanh toan: " + pay + "VND");
                break;
            }
        }
    }

    public void print_pay(int get_Tongngaythue, int get_maphong, String get_tenkhachhang) {
        listDepartmentSet.add(new List_Department(301, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(302, "Phong don", 50000));
        listDepartmentSet.add(new List_Department(401, "Phong doi", 100000));
        listDepartmentSet.add(new List_Department(402,"Phong doi",  100000));
        listDepartmentSet.add(new List_Department(501,"Phong vip", 200000));
        String directory = "C:\\Users\\PC\\Desktop\\Java\\Java_ManageStudent(OOP)\\ManageHotel\\";
        String fileName = directory + "ReportPayCustomer.txt";
        int pay = 0;
        for (List_Department department : listDepartmentSet) {
            if (get_maphong == department.getMaphong()) {
                pay = department.getGiaphong() * get_Tongngaythue;
                break;
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true))){
            //Ghi du lieu vao file
            bufferedWriter.write(get_tenkhachhang + ": ");
            bufferedWriter.write(Integer.toString(pay));
            bufferedWriter.newLine();
            System.out.println("File duoc luu thanh cong trong tai thu muc ManageHotel");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
