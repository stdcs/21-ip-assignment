package ip.syssrc.conditional;

/**
 * RoleAccess
 *
 * Assignment 1.2
 *
 * @author H071211066 - Syifa Ur Rahmi <sifasisi3@gmail.com>
 *
 */
import java.util.Scanner;
public class RoleAccess {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menuIndex = 0;
        int subMenuIndex = 0;
        boolean isValidRole = false;

        if (args.length == 0) {
            System.out.println("What role you want to see?");
            System.out.println("For example, try 'Admin'.");
        } else if (args.length == 1) {
                switch (args[0]){
                    case "Super Admin":
                    case "Admin":
                    case "User":
                        isValidRole = !isValidRole;
                }
            if (isValidRole)
                switch (args[0]) {
                    case "Super Admin":
                        menuIndex = menuIndex + 1;
                        System.out.printf("%d. Super Admin \n", menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. CRUD Super Admin \n" + menuIndex, subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. CRUD Admin \n" + menuIndex, subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. CRUD User \n" + menuIndex, subMenuIndex);
                        System.out.println();
                    case "Admin":
                        menuIndex = menuIndex + 1;
                        subMenuIndex = 0;
                        System.out.printf("%d. Admin \n", menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. CRUD Admin \n" + menuIndex, subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. CRUD User \n\n" + menuIndex, subMenuIndex);
                    default:
                        menuIndex = menuIndex + 1;
                        subMenuIndex = 0;
                        System.out.printf("%d. User \n" + menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. View \n" + menuIndex, subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.printf("%2d.%d. Edit \n" + menuIndex, subMenuIndex);
                        break;
                    }
            } else {
                System.out.println("Invalid Role");
                System.out.println("Valid Role : Super Admin, Admin, User");
            }
        } else {
            System.out.println("Too many argument");
        }
        in.close();
    }
}
