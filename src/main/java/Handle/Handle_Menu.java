package Handle;

import Utils.Utilities;

public class Handle_Menu {
     private int choice;
    //Ham xu ly lua chon menu
    public void choice_menu() {
        do {
            choice = Utilities.scanner.nextInt();
            if (choice == 1) {
                System.out.println("Day la 1");
            } else if (choice == 2) {
                System.out.println("Day la 2");
            }
        } while (choice != 8);
    }
}
