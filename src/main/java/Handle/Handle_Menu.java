package Handle;

import List.List_Menu;
import Utils.Utilities;

public class Handle_Menu {
     private int choice;
     List_Menu listMenu = new List_Menu();
     Handle_InfoDepartment handleInfoDepartment = new Handle_InfoDepartment();
     Handle_Checkin handleCheckin = new Handle_Checkin();
     Handle_InfoClient handleInfoClient = new Handle_InfoClient();
     Handle_InfoStaff handleInfoStaff = new Handle_InfoStaff();

    //Phuong thuc xu ly lua chon menu
    public void choice_menu() {
        listMenu.show_menu();
        do {
            choice = Utilities.scanner.nextInt();
            if (choice == 1) {
                handleCheckin.access_handlerentedroom();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 2) {
                handleCheckin.input_checkin();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 3) {
                handleCheckin.list_infoclient();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 4) {
                handleCheckin.access_handleremoveclient();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 5) {

                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 6) {
                handleCheckin.access_handleinfoclient();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 7) {
                handleInfoDepartment.show_infodepartment();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 8) {
                handleInfoStaff.show_infostaff();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 9) {

                System.out.print("Moi lua chon chuc nang: ");
            }
        } while (choice != 10);
    }
}
