package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211074 - Wd. Ananda Lesmono <nandalesmono@gmail.com>
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
              case "Admin":
              case "User":
                  isValidRole = true;
                  break;
          } 
          
        if (isValidRole) {
            switch (args[0]) {
                case "Super Admin":
                case "Admin":
                case "User":
                    isValidRole = true;
                    break;
            } 
            
            if (isValidRole) {
                switch (args[0]) {
                    case "Super Admin":
                        System.out.printf("%d. Super Admin\n", ++menuIndex);
                        System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex , ++subMenuIndex);
                        System.out.printf("%2d.%d. CRUD Admin\n", menuIndex , ++subMenuIndex);
                        System.out.printf("%2d.%d. CRUD User\n", menuIndex , ++subMenuIndex);
                        System.out.println();
                    
                    case "Admin":
                        subMenuIndex = 0;
                        System.out.printf("%d. Admin\n", ++menuIndex);
                        System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                        System.out.printf("%2d.%d. CRUD User\n", menuIndex, ++subMenuIndex);
                        System.out.println();
            
                    default:
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
}
