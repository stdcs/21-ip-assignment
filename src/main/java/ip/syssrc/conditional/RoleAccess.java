package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211078 - Muh Fajar Siddiq <fsdidiq072@gmail.com>
 *
 */
public class RoleAccess {
    public static void main(String[] args) {
        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;
    
        if (args.length == 0) {
          System.out.println("What role you want to see ?");
          System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {

            switch (args[0]) {
                case "Super Admin", "Admin", "User":
                    isValidRole = true;
                    break;
                default:
                    isValidRole = false;
                    break;
            }
            if (isValidRole == true) {
                switch (args[0] ) {
                case "Super Admin":
                    System.out.printf("%2d.%d. CRUD Super Admin\n", ++menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, ++subMenuIndex);
                    System.out.println();
<<<<<<< HEAD
                    case "Admin":
=======
                case "Admin":
>>>>>>> c1f7cd40f4304067a7a133d14add23ccbde10b2a
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", ++menuIndex);
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
<<<<<<< HEAD
                    default:
=======
                default:
>>>>>>> c1f7cd40f4304067a7a133d14add23ccbde10b2a
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", ++menuIndex);
                    System.out.printf("%2d.%d. View\n", menuIndex, ++subMenuIndex);
                    System.out.printf("%2d.%d. Edit\n", menuIndex, ++subMenuIndex);
                    break;
                }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
    }
}
