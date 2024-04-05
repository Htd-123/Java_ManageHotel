package Handle;

import List.List_Department;

import java.util.Set;

public class Handle_InfoDepartment {
    List_Department listDepartment = new List_Department();
    public void show_infodepartment() {
        //Lay danh sach thong tin phong
        listDepartment.list_InfoDepartment();
        Set<List_Department> listDepartmentSet = listDepartment.getListDepartmentSet();

        // Duyet in ra cac phong
        System.out.println("-----------------");
        for (List_Department list_department: listDepartmentSet) {
            System.out.print("Ma phong: " + list_department.getMaphong());
            System.out.println(" Ten phong: " + list_department.getTenphong());
        }
        System.out.println("-----------------");
    }
}
