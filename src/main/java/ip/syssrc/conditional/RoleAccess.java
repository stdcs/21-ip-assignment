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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        
        } else if (args.length == 1) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a
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
<<<<<<< HEAD
=======
    
=======

>>>>>>> b42662b (fix (conditional/RoleAcces): change indentasi to '4 space')
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
=======
>>>>>>> 391b6fd (fix(conditional/RoleAccess): change indentasi)
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
<<<<<<< HEAD
<<<<<<< HEAD
          System.out.println("Too many argument");
>>>>>>> bf8cc79 (feat(conditional/Cashier) : add 'switch' object)
=======
              System.out.println("Too many argument");
>>>>>>> b42662b (fix (conditional/RoleAcces): change indentasi to '4 space')
=======
            System.out.println("Too many argument");
>>>>>>> 391b6fd (fix(conditional/RoleAccess): change indentasi)
=======
>>>>>>> 6acfac4418971f1a7bd72a63978b49ae464deb5a
        }
    }
}
