package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211083 - Liska Dewi Rombe <rombeliska@gmail.com>
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
                case "Super Admin":
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
                case "Admin":    
                case "User":
                    isValidRole = true;
                    break;
                
<<<<<<< HEAD
=======
                    isValidRole = true;
                    break;
                case "Admin":
                    isValidRole = true;
                    break;
                case "User":
                    isValidRole = true;
                    break;
                default:
                    isValidRole = false;
                    break;
>>>>>>> d036487 (feat(conditional/cashier): add 'java.util.Scanner' object)
=======
                case "Admin":    
                case "User":
                    isValidRole = true;
                    break;
                
>>>>>>> ef6fe0d (fix (conditional/RoleAccess): change code)
=======
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
            }
            if (isValidRole == true) {
                switch (args[0] ) {
                case "Super Admin":
                    menuIndex = menuIndex + 1;
                    System.out.printf("%d. Super Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                    System.out.println();
                case "Admin":
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, subMenuIndex);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    
=======
>>>>>>> d036487 (feat(conditional/cashier): add 'java.util.Scanner' object)
=======
                    
>>>>>>> dd048ed (feat (conditional/RoleAccess): add 'switch' object)
=======
                    
>>>>>>> 911945ebeb7ab89f2288e27a05b66a102742839e
                default:
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
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
