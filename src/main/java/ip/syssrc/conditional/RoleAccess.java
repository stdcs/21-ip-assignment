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
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 15df50e (delete)

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        
        } else if (args.length == 1) {
>>>>>>> b224690 (delete)
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 5eb0d90 (delete)
=======
=======
>>>>>>> d01c992 (delete)
=======
>>>>>>> f98dc4b (delete)
<<<<<<< HEAD
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
=======
    
=======
>>>>>>> 2d94d8f (delete)

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
<<<<<<< HEAD
=======
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
    
=======

>>>>>>> 0a3399e (fix (conditional/RoleAcces): change indentasi to '4 space')
        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        
        } else if (args.length == 1) {
<<<<<<< HEAD
          if (args[0].equals("Super Admin") || args[0].equals("Admin") || args[0].equals("User")){
              isValidRole = true;
          } if (isValidRole == true) {
=======
          switch (args[0]) {
              case "Super Admin":
              case "Admin":
              case "User":
              isValidRole = true;
              break;
          } 
          
        if (isValidRole) {
<<<<<<< HEAD
>>>>>>> b224690 (delete)
            switch (args[0]) {
                case "Super Admin":
                    menuIndex = menuIndex + 1;
                    System.out.printf("%d. Super Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex , subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex , subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Userr\n", menuIndex , subMenuIndex);
                    System.out.println();
                    
                case "Admin":
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                    System.out.println();
            
                default:
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
            
=======
=======
>>>>>>> de0bd4a (fix(conditional/RoleAccess): change indentasi)
            switch (args[0]) {
                case "Super Admin":
                case "Admin":
                case "User":
                    isValidRole = true;
>>>>>>> 2d94d8f (delete)
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
>>>>>>> d942e9b (feat(conditional/Cashier) : add 'switch' object)
<<<<<<< HEAD
>>>>>>> 5eb0d90 (delete)
=======
=======
              System.out.println("Too many argument");
>>>>>>> 0a3399e (fix (conditional/RoleAcces): change indentasi to '4 space')
<<<<<<< HEAD
>>>>>>> b224690 (delete)
=======
=======
            System.out.println("Too many argument");
>>>>>>> de0bd4a (fix(conditional/RoleAccess): change indentasi)
<<<<<<< HEAD
>>>>>>> 2d94d8f (delete)
=======
=======
    
=======

>>>>>>> b42662b (fix (conditional/RoleAcces): change indentasi to '4 space')
        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
        
        } else if (args.length == 1) {
<<<<<<< HEAD
<<<<<<< HEAD
          if (args[0].equals("Super Admin") || args[0].equals("Admin") || args[0].equals("User")){
              isValidRole = true;
          } if (isValidRole == true) {
=======
=======
=======
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
          switch (args[0]) {
              case "Super Admin":
              case "Admin":
              case "User":
              isValidRole = true;
              break;
          } 
          
        if (isValidRole) {
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 07a8b51 (delete')
            switch (args[0]) {
                case "Super Admin":
                    menuIndex = menuIndex + 1;
                    System.out.printf("%d. Super Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex , subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex , subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Userr\n", menuIndex , subMenuIndex);
                    System.out.println();
                    
                case "Admin":
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. Admin\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. CRUD User\n", menuIndex, subMenuIndex);
                    System.out.println();
            
                default:
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
            
=======
=======
>>>>>>> 391b6fd (fix(conditional/RoleAccess): change indentasi)
=======
>>>>>>> f98dc4b (delete)
            switch (args[0]) {
                case "Super Admin":
                case "Admin":
                case "User":
                    isValidRole = true;
>>>>>>> d01c992 (delete)
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
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
<<<<<<< HEAD
<<<<<<< HEAD
          System.out.println("Too many argument");
>>>>>>> bf8cc79 (feat(conditional/Cashier) : add 'switch' object)
<<<<<<< HEAD
>>>>>>> 700d9da (delete)
=======
=======
              System.out.println("Too many argument");
>>>>>>> b42662b (fix (conditional/RoleAcces): change indentasi to '4 space')
<<<<<<< HEAD
>>>>>>> 07a8b51 (delete')
=======
=======
=======
>>>>>>> f98dc4b (delete)
            System.out.println("Too many argument");
<<<<<<< HEAD
>>>>>>> 391b6fd (fix(conditional/RoleAccess): change indentasi)
<<<<<<< HEAD
>>>>>>> d01c992 (delete)
=======
=======
            }
>>>>>>> 15df50e (delete)
>>>>>>> f98dc4b (delete)
        }
    }
}
