package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071171512 - Fitrah Muhammad <fitrahm17h@student.unhas.ac.id>
 *
 */
public class RoleAccessSolution {

    public static void main(String[] args) {

        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0) {
            System.out.println("What role you want to see ?");
            System.out.println("For example, try 'Admin'.");
            return;
        }

        if (args.length > 1) {
            System.out.println("Too many argument");
            return;
        }

        switch (args[0]) {
            case "Super Admin":
            case "Admin":
            case "User":
                isValidRole = !isValidRole;
                break;
        }

        if (!isValidRole) {
            System.out.println("Invalid Role");
            System.out.println("Valid Role : Super Admin, Admin, User");
            return;
        }

        switch (args[0]) {
            case "Super Admin":
                System.out.printf("%d. Super Admin\n", ++menuIndex);
                System.out.printf("%2d.%d. CRUD Super Admin\n", menuIndex, ++subMenuIndex);
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
                subMenuIndex = 0;
            case "Admin":
                System.out.printf("%d. Admin\n", ++menuIndex);
                System.out.printf("%2d.%d. CRUD Admin\n", menuIndex, ++subMenuIndex);
                System.out.printf("%2d.%d. CRUD User\n\n", menuIndex, ++subMenuIndex);
                subMenuIndex = 0;
            default:
                System.out.printf("%d. User\n", ++menuIndex);
                System.out.printf("%2d.%d. View\n", menuIndex, ++subMenuIndex);
                System.out.printf("%2d.%d. Edit\n", menuIndex, ++subMenuIndex);
                subMenuIndex = 0;
        }

    }
}
