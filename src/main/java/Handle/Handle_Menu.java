package Handle;

import List.List_Menu;
import Utils.Utilities;

public class Handle_Menu {
     private int choice;
     List_Menu listMenu = new List_Menu();
     Handle_InfoDepartment handleInfoDepartment = new Handle_InfoDepartment();
     Handle_Checkin handleCheckin = new Handle_Checkin();

    //Ham xu ly lua chon menu
    public void choice_menu() {
        listMenu.show_menu();
        do {
            choice = Utilities.scanner.nextInt();
            if (choice == 1) {
                System.out.println("Day la 1");
            } else if (choice == 2) {
                System.out.println("Day la 2");
            } else if (choice == 3) {
                handleCheckin.input_checkin();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 4) {
                
            } else if (choice == 5) {

            } else if (choice == 6) {
                handleInfoDepartment.show_infodepartment();
                System.out.print("Moi lua chon chuc nang: ");
            } else if (choice == 7) {
                
            }
        } while (choice != 8);
    }
}
