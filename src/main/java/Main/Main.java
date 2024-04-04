package Main;


import Handle.Handle_Menu;
import List.List_Menu;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong
        List_Menu listMenu = new List_Menu();
        Handle_Menu handleMenu = new Handle_Menu();


        //Goi ham hien thi menu
        listMenu.show_menu();
        //Goi ham lua chon danh sach cac menu
        handleMenu.choice_menu();
    }
}
