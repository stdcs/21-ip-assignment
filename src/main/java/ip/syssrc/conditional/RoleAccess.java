package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211060 - Andi Muh. Ibnu Hibban Bagoes Malolo <andibagoes1412@gmail.com>
 *
 */
public class RoleAccess {

    public static void main(String[] args) {
        int MenuIndex = 0;
        int SubMenuIndex = 0;
        boolean isValidRole = false;
    
        if (args.length == 0) {
          System.out.println("What role you want to see ?");
          System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
            switch (args[0]) {
                case "Super Admin":
                case "Admin":
                case "User":
                  isValidRole = true;
                  break;
            } if (isValidRole == true) {
                switch (args[0] ) {
                case "Super Admin":
                    MenuIndex = MenuIndex + 1;
                    System.out.printf("%d. Super Admin\n", MenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%SubMenuIndex2d.%d. CRUD Super Admin\n", MenuIndex, SubMenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", MenuIndex, SubMenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n", MenuIndex, SubMenuIndex);
                    System.out.println();
                case "Admin":
                    MenuIndex = MenuIndex + 1;
                    SubMenuIndex = 0;
                    System.out.printf("%d. Admin\n", MenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", MenuIndex, SubMenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n\n", MenuIndex, SubMenuIndex);
                default:
                    MenuIndex = MenuIndex + 1;
                    SubMenuIndex = 0;
                    System.out.printf("%d. User\n", MenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", MenuIndex, SubMenuIndex);
                    SubMenuIndex = SubMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", MenuIndex, SubMenuIndex);
                    break;
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role = Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
    }
}
