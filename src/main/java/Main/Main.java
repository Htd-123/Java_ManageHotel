package Main;


import Handle.Handle_Menu;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong Handle_Menu
        Handle_Menu handleMenu = new Handle_Menu();
        //Goi ham lua chon danh sach cac menu
        handleMenu.choice_menu();
    }
}
