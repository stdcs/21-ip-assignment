package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211085 - Hafiedz Hasmy Hamid <hasmy41@gmail.com>
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
=======
>>>>>>> 3a64fa5 (feat(conditional/RoleAccess): add 'MenuIndex' 'subMenuIndex' 'isValidRole' as variable)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)
>>>>>>> 942d9dd (feat(conditional/RoleAccess): add if else conditional and add switch)

>>>>>>> 6cd1c3e (feat(conditional/RoleAccess): add int menuIndex = 0;)
        if (args.length == 0) {
          System.out.println("What role you want to see ?");
          System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {

            switch (args[0]) {
                case "Super Admin":
<<<<<<< HEAD
<<<<<<< HEAD
                    isValidRole = true;
                    break;
=======
<<<<<<< HEAD
>>>>>>> 942d9dd (feat(conditional/RoleAccess): add if else conditional and add switch)
=======
<<<<<<< HEAD
>>>>>>> d460b85 (feat(conditional/RoleAccess.java): fix switch case)
                case "Admin":
                    isValidRole = true;
                    break;
                case "User":
                    isValidRole = true;
                    break;
<<<<<<< HEAD
<<<<<<< HEAD
                
            }
=======
        }
<<<<<<< HEAD
>>>>>>> 7cbdb32 (fix(conditional/RoleAccess.java))
            if (isValidRole == true) {
=======
=======
            }
            
>>>>>>> 30803eb (feat(conditional\RoleAccess.java): fix 'if (isValidRole)' space indent)
            if (isValidRole) {
>>>>>>> 6a503c4 (feat(conditional/RoleAccess.java): fix git status)
                switch (args[0] ) {
<<<<<<< HEAD
=======
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
                    default:
                        menuIndex = menuIndex + 1;
                        subMenuIndex = 0;
                        System.out.printf("%d. User\n", menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
                        break;
=======
                    isValidRole = true;
                    break;
=======
>>>>>>> ebf6ea2 (feat(conditional/RoleAccess.java): fix switch case)
                case "Admin":
                case "User":
                    isValidRole = true;
                    break;
                default:
                    isValidRole = false;
                    break;
            }
            if (isValidRole == true) {
                switch (args[0] ) {
>>>>>>> 942d9dd (feat(conditional/RoleAccess): add if else conditional and add switch)
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
                default:
                    menuIndex = menuIndex + 1;
                    subMenuIndex = 0;
                    System.out.printf("%d. User\n", menuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. View\n", menuIndex, subMenuIndex);
                    subMenuIndex = subMenuIndex + 1;
                    System.out.printf("%2d.%d. Edit\n", menuIndex, subMenuIndex);
                    break;
<<<<<<< HEAD
=======
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)
>>>>>>> 942d9dd (feat(conditional/RoleAccess): add if else conditional and add switch)
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
>>>>>>> e74f85d (feat(conditional/RoleAccess): add int menuIndex = 0;)
=======
        
>>>>>>> 22c0e13 (feat(conditional/RoleAccess): add 'MenuIndex' 'subMenuIndex' 'isValidRole' as variable)
=======
>>>>>>> 1202a78 (feat(conditional/RoleAccess): add if else conditional and add switch)
    }
}