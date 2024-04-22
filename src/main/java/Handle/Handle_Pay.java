package Handle;

import List.List_Department;

import java.util.List;
import java.util.Set;

public class Handle_Pay extends Abstract{
    List_Department listDepartment = new List_Department();
    @Override
    public void handle_pay(int songaythue) {
        Set<List_Department> listDepartments = listDepartment.getListDepartmentSet();
        for (List_Department list_department: listDepartments) {
            System.out.println(list_department.getGiaphong() + songaythue);
        }
    }
}
