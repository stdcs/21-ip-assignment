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
                    case "Super Admin" :
                        isValidRole = true;
                        break;
                    case "Admin" :
                        isValidRole = true;
                        break;
                    case "User" :
                        isValidRole = true;
                        break;
                    default :
                        isValidRole = false;
                        break;
                }
            if (isValidRole == true)
                switch (args[0]) {
                    case "Super Admin" :
                        menuIndex = menuIndex + 1;
                        System.out.println("%d. Super Admin \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%d. CRUD Super Admin \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%2d. CRUD Admin \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%3d. CRUD User \n" +subMenuIndex);
                        System.out.println();
                        menuIndex = menuIndex + 1;
                        System.out.println("%2d. Admin \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%2d.%d. CRUD Admin \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%2d.%2d. CRUD User \n" +subMenuIndex);
                        System.out.println();
                        menuIndex = menuIndex + 1;
                        System.out.println("%3d. User \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%3d.%d. View \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%3d.%2d. Edit \n" +subMenuIndex);
                        System.out.println();
                    case "Admin" :
                        menuIndex = menuIndex + 1;
                        System.out.println("%d. Admin \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%d. CRUD Admin \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%2d. CRUD User \n" +subMenuIndex);
                        menuIndex = menuIndex + 1;
                        System.out.println("%2d. User \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%2d.%d. View \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%2d.%2d. Edit \n" +subMenuIndex);
                        System.out.println();
                    default :
                        menuIndex = menuIndex + 1;
                        System.out.println("%d. User \n" +menuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%d. View \n" +subMenuIndex);
                        subMenuIndex = subMenuIndex + 1;
                        System.out.println("%d.%2d. Edit \n");
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
