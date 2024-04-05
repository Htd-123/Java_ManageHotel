package List;

import Object.InfoDepartment;

import java.util.*;

public class List_Department extends InfoDepartment {
    Set<List_Department> listDepartmentSet = new LinkedHashSet<>();

    public List_Department() {

    }
    public List_Department(int maphong, String tenphong) {
        super(maphong, tenphong);
    }
    public Set<List_Department> getListDepartmentSet() {
        return listDepartmentSet;
    }

    public void setListDepartmentSet(Set<List_Department> listDepartmentSet) {
        this.listDepartmentSet = listDepartmentSet;
    }

    public void list_InfoDepartment() {
        listDepartmentSet.add(new List_Department(301, "Phong don"));
        listDepartmentSet.add(new List_Department(302, "Phong don"));
        listDepartmentSet.add(new List_Department(401, "Phong doi"));
        listDepartmentSet.add(new List_Department(402,"Phong doi"));
        listDepartmentSet.add(new List_Department(501,"Phong vip"));
    }
}
